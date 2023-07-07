import java.util.Date;
import java.util.List;

public abstract class Receipts {
    protected Date date;
    protected List<String> purchasing;
    protected String store;

    ReceiptLayout receiptLayout = new Layout1();
    IndustrySector industrySector = new Food();

    public void setReceiptLayout(ReceiptLayout receiptLayout){
        this.receiptLayout = receiptLayout;
    }

    public void setIndustrySector(IndustrySector industrySector){
        this.industrySector = industrySector;
    }

}
