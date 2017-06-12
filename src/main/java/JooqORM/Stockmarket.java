/**
 * This class is generated by jOOQ
 */
package JooqORM;


import JooqORM.tables.ChineseMarketCompany;
import JooqORM.tables.Cmarketearning;
import JooqORM.tables.UsmarketCompany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Stockmarket extends SchemaImpl {

    private static final long serialVersionUID = -739734430;

    /**
     * The reference instance of <code>StockMarket</code>
     */
    public static final Stockmarket STOCKMARKET = new Stockmarket();

    /**
     * The table <code>StockMarket.chinese_market_company</code>.
     */
    public final ChineseMarketCompany CHINESE_MARKET_COMPANY = JooqORM.tables.ChineseMarketCompany.CHINESE_MARKET_COMPANY;

    /**
     * The table <code>StockMarket.cmarketearning</code>.
     */
    public final Cmarketearning CMARKETEARNING = JooqORM.tables.Cmarketearning.CMARKETEARNING;

    /**
     * The table <code>StockMarket.usmarket_company</code>.
     */
    public final UsmarketCompany USMARKET_COMPANY = JooqORM.tables.UsmarketCompany.USMARKET_COMPANY;

    /**
     * No further instances allowed
     */
    private Stockmarket() {
        super("StockMarket", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            ChineseMarketCompany.CHINESE_MARKET_COMPANY,
            Cmarketearning.CMARKETEARNING,
            UsmarketCompany.USMARKET_COMPANY);
    }
}
