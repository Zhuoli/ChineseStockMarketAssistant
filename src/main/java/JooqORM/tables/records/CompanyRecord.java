/**
 * This class is generated by jOOQ
 */
package JooqORM.tables.records;


import JooqORM.tables.Company;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


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
public class CompanyRecord extends UpdatableRecordImpl<CompanyRecord> implements Record15<String, Double, Double, String, Double, Timestamp, Timestamp, Double, Double, Double, Integer, Integer, Double, Double, Double> {

    private static final long serialVersionUID = -1061964500;

    /**
     * Setter for <code>ChineseStock.company.stockid</code>. 股票ID
     */
    public void setStockid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>ChineseStock.company.stockid</code>. 股票ID
     */
    public String getStockid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ChineseStock.company.capitalizationvalue</code>. 流通市值
     */
    public void setCapitalizationvalue(Double value) {
        set(1, value);
    }

    /**
     * Getter for <code>ChineseStock.company.capitalizationvalue</code>. 流通市值
     */
    public Double getCapitalizationvalue() {
        return (Double) get(1);
    }

    /**
     * Setter for <code>ChineseStock.company.closeprice</code>. 昨日收盘价
     */
    public void setCloseprice(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>ChineseStock.company.closeprice</code>. 昨日收盘价
     */
    public Double getCloseprice() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>ChineseStock.company.companyname</code>. 公司名称
     */
    public void setCompanyname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>ChineseStock.company.companyname</code>. 公司名称
     */
    public String getCompanyname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ChineseStock.company.currentprice</code>. Current Price
     */
    public void setCurrentprice(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>ChineseStock.company.currentprice</code>. Current Price
     */
    public Double getCurrentprice() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>ChineseStock.company.currentpricetimestamp</code>.
     */
    public void setCurrentpricetimestamp(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>ChineseStock.company.currentpricetimestamp</code>.
     */
    public Timestamp getCurrentpricetimestamp() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ChineseStock.company.last_update_date_time</code>. 最后一次更新时间
     */
    public void setLastUpdateDateTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>ChineseStock.company.last_update_date_time</code>. 最后一次更新时间
     */
    public Timestamp getLastUpdateDateTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ChineseStock.company.marketcap</code>. 总市值
     */
    public void setMarketcap(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>ChineseStock.company.marketcap</code>. 总市值
     */
    public Double getMarketcap() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>ChineseStock.company.openprice</code>. 开盘价
     */
    public void setOpenprice(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>ChineseStock.company.openprice</code>. 开盘价
     */
    public Double getOpenprice() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>ChineseStock.company.oscillation</code>. 股票振幅
     */
    public void setOscillation(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>ChineseStock.company.oscillation</code>. 股票振幅
     */
    public Double getOscillation() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>ChineseStock.company.pbr</code>. 市净率 Price-to-book ratio
     */
    public void setPbr(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>ChineseStock.company.pbr</code>. 市净率 Price-to-book ratio
     */
    public Integer getPbr() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>ChineseStock.company.per</code>. 市盈率
     */
    public void setPer(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>ChineseStock.company.per</code>. 市盈率
     */
    public Integer getPer() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>ChineseStock.company.tradingvalue</code>. 成交额
     */
    public void setTradingvalue(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>ChineseStock.company.tradingvalue</code>. 成交额
     */
    public Double getTradingvalue() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>ChineseStock.company.tradingvolume</code>. 成交量
     */
    public void setTradingvolume(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>ChineseStock.company.tradingvolume</code>. 成交量
     */
    public Double getTradingvolume() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>ChineseStock.company.turnoverrate</code>. 换手率
     */
    public void setTurnoverrate(Double value) {
        set(14, value);
    }

    /**
     * Getter for <code>ChineseStock.company.turnoverrate</code>. 换手率
     */
    public Double getTurnoverrate() {
        return (Double) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, Double, Double, String, Double, Timestamp, Timestamp, Double, Double, Double, Integer, Integer, Double, Double, Double> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, Double, Double, String, Double, Timestamp, Timestamp, Double, Double, Double, Integer, Integer, Double, Double, Double> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Company.COMPANY.STOCKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field2() {
        return Company.COMPANY.CAPITALIZATIONVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field3() {
        return Company.COMPANY.CLOSEPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Company.COMPANY.COMPANYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Company.COMPANY.CURRENTPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Company.COMPANY.CURRENTPRICETIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Company.COMPANY.LAST_UPDATE_DATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field8() {
        return Company.COMPANY.MARKETCAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field9() {
        return Company.COMPANY.OPENPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field10() {
        return Company.COMPANY.OSCILLATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Company.COMPANY.PBR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Company.COMPANY.PER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field13() {
        return Company.COMPANY.TRADINGVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field14() {
        return Company.COMPANY.TRADINGVOLUME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field15() {
        return Company.COMPANY.TURNOVERRATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getStockid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value2() {
        return getCapitalizationvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value3() {
        return getCloseprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCompanyname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getCurrentprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCurrentpricetimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getLastUpdateDateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value8() {
        return getMarketcap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value9() {
        return getOpenprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value10() {
        return getOscillation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getPbr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getPer();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value13() {
        return getTradingvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value14() {
        return getTradingvolume();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value15() {
        return getTurnoverrate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value1(String value) {
        setStockid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value2(Double value) {
        setCapitalizationvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value3(Double value) {
        setCloseprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value4(String value) {
        setCompanyname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value5(Double value) {
        setCurrentprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value6(Timestamp value) {
        setCurrentpricetimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value7(Timestamp value) {
        setLastUpdateDateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value8(Double value) {
        setMarketcap(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value9(Double value) {
        setOpenprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value10(Double value) {
        setOscillation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value11(Integer value) {
        setPbr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value12(Integer value) {
        setPer(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value13(Double value) {
        setTradingvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value14(Double value) {
        setTradingvolume(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord value15(Double value) {
        setTurnoverrate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CompanyRecord values(String value1, Double value2, Double value3, String value4, Double value5, Timestamp value6, Timestamp value7, Double value8, Double value9, Double value10, Integer value11, Integer value12, Double value13, Double value14, Double value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CompanyRecord
     */
    public CompanyRecord() {
        super(Company.COMPANY);
    }

    /**
     * Create a detached, initialised CompanyRecord
     */
    public CompanyRecord(String stockid, Double capitalizationvalue, Double closeprice, String companyname, Double currentprice, Timestamp currentpricetimestamp, Timestamp lastUpdateDateTime, Double marketcap, Double openprice, Double oscillation, Integer pbr, Integer per, Double tradingvalue, Double tradingvolume, Double turnoverrate) {
        super(Company.COMPANY);

        set(0, stockid);
        set(1, capitalizationvalue);
        set(2, closeprice);
        set(3, companyname);
        set(4, currentprice);
        set(5, currentpricetimestamp);
        set(6, lastUpdateDateTime);
        set(7, marketcap);
        set(8, openprice);
        set(9, oscillation);
        set(10, pbr);
        set(11, per);
        set(12, tradingvalue);
        set(13, tradingvolume);
        set(14, turnoverrate);
    }
}
