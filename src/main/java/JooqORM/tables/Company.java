/**
 * This class is generated by jOOQ
 */
package JooqORM.tables;


import JooqORM.Chinesestock;
import JooqORM.Keys;
import JooqORM.tables.records.CompanyRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Company extends TableImpl<CompanyRecord> {

    private static final long serialVersionUID = -2098028590;

    /**
     * The reference instance of <code>ChineseStock.Company</code>
     */
    public static final Company COMPANY = new Company();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompanyRecord> getRecordType() {
        return CompanyRecord.class;
    }

    /**
     * The column <code>ChineseStock.Company.stockid</code>. 股票ID
     */
    public final TableField<CompanyRecord, String> STOCKID = createField("stockid", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "股票ID");

    /**
     * The column <code>ChineseStock.Company.companyname</code>. 公司名称
     */
    public final TableField<CompanyRecord, String> COMPANYNAME = createField("companyname", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "公司名称");

    /**
     * The column <code>ChineseStock.Company.currentprice</code>. Current stock price
     */
    public final TableField<CompanyRecord, Double> CURRENTPRICE = createField("currentprice", org.jooq.impl.SQLDataType.FLOAT, this, "Current stock price");

    /**
     * The column <code>ChineseStock.Company.currentpricetimestamp</code>.
     */
    public final TableField<CompanyRecord, Timestamp> CURRENTPRICETIMESTAMP = createField("currentpricetimestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ChineseStock.Company.openprice</code>. 开盘价
     */
    public final TableField<CompanyRecord, Double> OPENPRICE = createField("openprice", org.jooq.impl.SQLDataType.FLOAT, this, "开盘价");

    /**
     * The column <code>ChineseStock.Company.closeprice</code>. 昨日收盘价
     */
    public final TableField<CompanyRecord, Double> CLOSEPRICE = createField("closeprice", org.jooq.impl.SQLDataType.FLOAT, this, "昨日收盘价");

    /**
     * The column <code>ChineseStock.Company.marketcap</code>. 总市值
     */
    public final TableField<CompanyRecord, Double> MARKETCAP = createField("marketcap", org.jooq.impl.SQLDataType.FLOAT, this, "总市值");

    /**
     * The column <code>ChineseStock.Company.capitalizationvalue</code>. 流通市值
     */
    public final TableField<CompanyRecord, Double> CAPITALIZATIONVALUE = createField("capitalizationvalue", org.jooq.impl.SQLDataType.FLOAT, this, "流通市值");

    /**
     * The column <code>ChineseStock.Company.tradingvolume</code>. 成交量
     */
    public final TableField<CompanyRecord, Double> TRADINGVOLUME = createField("tradingvolume", org.jooq.impl.SQLDataType.FLOAT, this, "成交量");

    /**
     * The column <code>ChineseStock.Company.tradingvalue</code>. 成交额
     */
    public final TableField<CompanyRecord, Double> TRADINGVALUE = createField("tradingvalue", org.jooq.impl.SQLDataType.FLOAT, this, "成交额");

    /**
     * The column <code>ChineseStock.Company.oscillation</code>. 股票振幅
     */
    public final TableField<CompanyRecord, Double> OSCILLATION = createField("oscillation", org.jooq.impl.SQLDataType.FLOAT, this, "股票振幅");

    /**
     * The column <code>ChineseStock.Company.turnoverrate</code>. 换手率
     */
    public final TableField<CompanyRecord, Double> TURNOVERRATE = createField("turnoverrate", org.jooq.impl.SQLDataType.FLOAT.defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.FLOAT)), this, "换手率");

    /**
     * The column <code>ChineseStock.Company.PBR</code>. 市净率 Price-to-book ratio
     */
    public final TableField<CompanyRecord, Integer> PBR = createField("PBR", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "市净率 Price-to-book ratio");

    /**
     * The column <code>ChineseStock.Company.PER</code>. 市盈率
     */
    public final TableField<CompanyRecord, Integer> PER = createField("PER", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "市盈率");

    /**
     * The column <code>ChineseStock.Company.lastUpdateDateTime</code>. 最后一次更新时间
     */
    public final TableField<CompanyRecord, Timestamp> LASTUPDATEDATETIME = createField("lastUpdateDateTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "最后一次更新时间");

    /**
     * Create a <code>ChineseStock.Company</code> table reference
     */
    public Company() {
        this("Company", null);
    }

    /**
     * Create an aliased <code>ChineseStock.Company</code> table reference
     */
    public Company(String alias) {
        this(alias, COMPANY);
    }

    private Company(String alias, Table<CompanyRecord> aliased) {
        this(alias, aliased, null);
    }

    private Company(String alias, Table<CompanyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Chinesestock.CHINESESTOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CompanyRecord> getPrimaryKey() {
        return Keys.KEY_COMPANY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CompanyRecord>> getKeys() {
        return Arrays.<UniqueKey<CompanyRecord>>asList(Keys.KEY_COMPANY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Company as(String alias) {
        return new Company(alias, this);
    }

    /**
     * Rename this table
     */
    public Company rename(String name) {
        return new Company(name, null);
    }
}
