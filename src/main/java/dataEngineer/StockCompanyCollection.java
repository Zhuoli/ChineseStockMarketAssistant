package dataEngineer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

/**
 * Created by zhuolil on 1/16/17.
 */
public final class StockCompanyCollection {

    private static final String SZ_STOCK_LIST_PATH = "SZAstockList.csv";
    private static final String SH_STOCK_LIST_PATH = "SHAstockList.csv";
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private  static StockCompanyCollection thisInstance = null;
    private static Collection<SharesQuote> companyObjectCollection = null;

    private StockCompanyCollection(){
        // Does nothing
    }

    public static StockCompanyCollection getInstance(){
        if (thisInstance == null){
            thisInstance = new StockCompanyCollection();
        }
        return thisInstance;
    }

    public SharesQuote[] queryCompanyList(boolean isDebug){
        String msg = isDebug ? "Application is run in IDE" : "Application is run in jar";
        System.out.println(msg);

        if (companyObjectCollection == null){
            companyObjectCollection = new LinkedList<>();
            companyObjectCollection.addAll(this.readSZAStockCompanyList(isDebug? "./src/main/resources/" + SZ_STOCK_LIST_PATH : SZ_STOCK_LIST_PATH));
            companyObjectCollection.addAll(this.readSHAStockCompanyList(isDebug? "./src/main/resources/" + SH_STOCK_LIST_PATH : SH_STOCK_LIST_PATH));
        }
        return companyObjectCollection.toArray(new SharesQuote[0]);
    }

    /**
     * Reads ShangHai Stock Market company list.
     * @param csvFile
     * @return : A Stock market company list;
     */
    private List<SharesQuote> readSHAStockCompanyList(String csvFile){

        System.out.println("Current path: " + Paths.get(".").toAbsolutePath());
        Assert.assertTrue("File not exist: " + csvFile, Files.exists(Paths.get(csvFile)));
        List<SharesQuote> companyObjectList = new LinkedList<>();
        try(Scanner scanner = new Scanner(new File(csvFile)))
        {
            if (scanner.hasNext()) {
                List<String> headers = parseLine(scanner.nextLine());
                Assert.assertNotNull(headers);
                Assert.assertTrue(headers.size()>=7);
                Assert.assertEquals("公司代码", headers.get(0).substring(1, 5));
                Assert.assertEquals("公司简称", headers.get(1).substring(0, 4));
                Assert.assertEquals("A股代码", headers.get(2).substring(0, 4));
                Assert.assertEquals("A股简称", headers.get(3).substring(0, 4));
                Assert.assertEquals("A股上市日期", headers.get(4));
                Assert.assertEquals("A股总股本", headers.get(5));
                Assert.assertEquals("A股流通股本", headers.get(6));
            }

            // Read row
            while (scanner.hasNext()) {
                List<String> line = parseLine(scanner.nextLine());
                Assert.assertEquals(line.stream().reduce("Line-> ", (a,b) -> a+"\nB: -> "+b), 7, line.size());
                SharesQuote companyObject = new SharesQuote();
//                companyObject.code = "sh" + line.get(0).trim();
                companyObject.stockid = "sh" + line.get(2).trim();
                companyObject.companyname = line.get(3).trim();
                companyObjectList.add(companyObject);
            }

        }catch (IOException exc){
            System.err.println("Exception on idx: " + companyObjectList.size() + "\n" + exc.getMessage());
        }
        return companyObjectList;
    }

    /**
     * Reads ShenZhen Stock A Market.
     * @param csvFile
     * @return List of company.
     */
    private List<SharesQuote> readSZAStockCompanyList(String csvFile){
        System.out.println("Current path: " + Paths.get(".").toAbsolutePath());
        Assert.assertTrue("File not exist: " + csvFile, Files.exists(Paths.get(csvFile)));
        List<SharesQuote> companyObjectList = new LinkedList<>();
        try(Scanner scanner = new Scanner(new File(csvFile)))
        {
            if (scanner.hasNext()){
                List<String> headers = parseLine(scanner.nextLine());
                Assert.assertNotNull(headers);
                Assert.assertEquals("公司代码", headers.get(0).substring(1));
                Assert.assertEquals("公司简称", headers.get(1));
                Assert.assertEquals("公司全称", headers.get(2));
                Assert.assertEquals("A股代码", headers.get(5));
                Assert.assertEquals("公司网址", headers.get(19));
            }
            while (scanner.hasNext()) {
                List<String> line = parseLine(scanner.nextLine());
                Assert.assertEquals(line.stream().reduce("Line-> ", (a,b) -> a+"\nB: -> "+b), 20, line.size());
                SharesQuote companyObject = new SharesQuote();
                companyObject.companyname = line.get(1);
                companyObject.stockid = "sz" + StringUtils.repeat("0", Math.max(0, 6-line.get(5).length())) + line.get(5);
                companyObject.officialWebUrl = line.get(19);
                companyObjectList.add(companyObject);
            }

        }catch (Exception exc){
            System.err.println("Exception on idx: " + companyObjectList.size() + "\n" + exc.getMessage());
        }
        return companyObjectList;
    }

    public static List<String> parseLine(String cvsLine) {
        return parseLine(cvsLine, DEFAULT_SEPARATOR, DEFAULT_QUOTE);
    }

    public static List<String> parseLine(String cvsLine, char separators) {
        return parseLine(cvsLine, separators, DEFAULT_QUOTE);
    }

    public static List<String> parseLine(String cvsLine, char separators, char customQuote) {

        List<String> result = new ArrayList<>();

        //if empty, return!
        if (cvsLine == null && cvsLine.isEmpty()) {
            return result;
        }

        if (customQuote == ' ') {
            customQuote = DEFAULT_QUOTE;
        }

        if (separators == ' ') {
            separators = DEFAULT_SEPARATOR;
        }

        StringBuffer curVal = new StringBuffer();
        boolean inQuotes = false;
        boolean startCollectChar = false;
        boolean doubleQuotesInColumn = false;

        char[] chars = cvsLine.toCharArray();

        for (char ch : chars) {

            if (inQuotes) {
                startCollectChar = true;
                if (ch == customQuote) {
                    inQuotes = false;
                    doubleQuotesInColumn = false;
                } else {

                    //Fixed : allow "" in custom quote enclosed
                    if (ch == '\"') {
                        if (!doubleQuotesInColumn) {
                            curVal.append(ch);
                            doubleQuotesInColumn = true;
                        }
                    } else {
                        curVal.append(ch);
                    }

                }
            } else {
                if (ch == customQuote) {

                    inQuotes = true;

                    //Fixed : allow "" in empty quote enclosed
                    if (chars[0] != '"' && customQuote == '\"') {
                        curVal.append('"');
                    }

                    //double quotes in column will hit this!
                    if (startCollectChar) {
                        curVal.append('"');
                    }

                } else if (ch == separators) {

                    result.add(curVal.toString());

                    curVal = new StringBuffer();
                    startCollectChar = false;

                } else if (ch == '\r') {
                    //ignore LF characters
                    continue;
                } else if (ch == '\n') {
                    //the end, break!
                    break;
                } else {
                    curVal.append(ch);
                }
            }

        }

        result.add(curVal.toString());

        return result;
    }
}
