import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Bills {
    String numOfBill;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date dateOfOpening;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date dateOfClosing;

    public Bills(String numOfBill, Date dateOfOpening, Date dateOfClosing){
        this.numOfBill = numOfBill;
        this.dateOfOpening = dateOfOpening;
        this.dateOfClosing = dateOfClosing;
    }

    public Bills(){
        super();
    }

    public String getNumOfBill(){
        return numOfBill;
    }
    public void setNumOfBill(String numOfBill) {
        this.numOfBill = numOfBill;
    }

    public Date getDateOfClosing() {
        return dateOfClosing;
    }
    public void setDateOfClosing(Date dateOfClosing) {
        this.dateOfClosing = dateOfClosing;
    }

    public Date getDateOfOpening() {
        return dateOfOpening;
    }
    public void setDateOfOpening(Date dateOfOpening) {
        this.dateOfOpening = dateOfOpening;
    }

    public void printAll(){
        System.out.format("%-17.15s %-31.30s %-33.30s",
                numOfBill, dateOfOpening.toString(), dateOfClosing.toString());
    }
}
