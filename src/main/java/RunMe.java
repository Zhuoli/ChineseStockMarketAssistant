import MarketChinese.ChineseMarketMaster;
import MarketUS.USMarketMaster;
import dataEngineer.financeWebEngine.WencaiParser;
import org.apache.commons.cli.*;
import util.MarketConstant;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Entry point.
 */
public class RunMe {
    private CommandLine cmd;

    public static void main(String[] args) {

        RunMe runMe = new RunMe(args);

        if (runMe.cmd == null) {
            System.err.println("Failed on CommandLine initialization, system exit.");
            System.exit(1);
        }

        ChineseMarketMaster chineseMarketMaster = new ChineseMarketMaster(runMe.cmd);
        USMarketMaster usMarketMaster = new USMarketMaster(runMe.cmd);
        ThreadPoolExecutor executorService = (ThreadPoolExecutor)Executors.newCachedThreadPool();

        // Run one round of query & update despite the current time
        if (runMe.cmd.hasOption(MarketConstant.DEBUG)) {
            // Disable us market as we don't need it currently
//            executorService.submit(() -> {
//                usMarketMaster.init();
//                usMarketMaster.querryAndUpdate();
//            });

            executorService.submit(() -> {
                chineseMarketMaster.init();
                chineseMarketMaster.querryAndUpdate();
            });
        }

        if (runMe.cmd.hasOption(MarketConstant.FINANCIAL)){

            // Parse and write earning report financial data
            executorService.submit(() -> {
                chineseMarketMaster.parseAndWriteFinancialDate();
            });

        }

        if (executorService.getActiveCount() > 0) {
            try {
                executorService.awaitTermination(10, TimeUnit.MINUTES);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }

        // Start the periodical stock parse
        chineseMarketMaster.run();
        usMarketMaster.run();
    }

    /**
     * Constructor.
     * 
     * @param args
     */
    private RunMe(String[] args) {
        // create Options object
        Options options = new Options();

        // add t option
        options.addOption(MarketConstant.IS_UNDER_INTELLIJ, false, "Is running under IDE or not");
        options.addOption(MarketConstant.DEBUG, false, "Is running under Debug model or not");
        options.addOption(MarketConstant.FINANCIAL, false, "Should parse financial report or not");
        CommandLineParser parser = new DefaultParser();

        try {
            this.cmd = parser.parse(options, args);
        } catch (ParseException exc) {
            System.err.println("Arguments parse exception: " + exc.getMessage());
        }
    }
}
