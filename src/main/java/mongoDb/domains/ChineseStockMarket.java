package mongoDb.domains;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * Created by zhuol on 2017/7/4.
 */
@Data
public class ChineseStockMarket extends ICollection{
    public final static String TABLE_NAME = "chinesestockmarket";

    public String companyName;

    public double currentPrice;

    public Date lastUpdatedTime;

    @Builder
    private ChineseStockMarket(String _id, String companyName, double currentPrice, Date lastUpdatedTime){
        super(_id);
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.lastUpdatedTime = lastUpdatedTime;
    }
}
