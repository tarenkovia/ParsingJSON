import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class BankCard {
    String firstName;
    String surname;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date dateOfClosing;
    String cardNum;
    int cvv;

    public BankCard(){
        super();
    }

    public BankCard(String firstName, String surname, Date dateOfClosing, String cardNum, int cvv){
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfClosing = dateOfClosing;
        this.cardNum = cardNum;
        this.cvv = cvv;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCardNum(){
        return cardNum;
    }
    public void setCardNum(String cardNum){
        this.cardNum = cardNum;
    }

    public int getCVV(){
        return cvv;
    }
    public void setCVV(int cvv) {
        this.cvv = cvv;
    }

    public Date getDateOfClosing() {
        return dateOfClosing;
    }
    public void setDateOfClosing(Date dateOfClosing) {
        this.dateOfClosing = dateOfClosing;
    }

    public void printAll(){
        System.out.format("%-22.19s %-30.30s %-10.10s\n",
                cardNum, dateOfClosing.toString(), cvv);
    }
}
