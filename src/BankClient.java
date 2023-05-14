import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankClient {
    public int ID;
    public PassData client;
    public ArrayList<Bills> bills;
    public ArrayList<BankCard> bankCards;

    public BankClient(int ID, PassData client, ArrayList<Bills> bills, ArrayList<BankCard> bankCards){
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
        for(Bills i: bills) {
            i.printAll();
        }
        for(BankCard j: bankCards) {
            j.printAll();
        }
    }

}
