import java.util.Date;
import java.util.List;

public class BankClient {
    public int ID;
    public PassData client;
    public Bills bills;
    public BankCard bankCards;

    public BankClient(int ID, PassData client, Bills bills, BankCard bankCards){
        this.ID = ID;
        this.client = client;
        this.bills = bills;
        this.bankCards = bankCards;
    }

    public BankClient(){
        super();
    }

    public void printAll(){
        System.out.format("%-3.3s", ID);
        client.printAll();
        bills.printAll();
        bankCards.printAll();
    }

}
