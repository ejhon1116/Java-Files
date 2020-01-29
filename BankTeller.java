import java.math.BigDecimal;

public class BankTeller {
    private String name;
    private String ID;
    private CustomerAccount account;
    
    public BankTeller() {
        this.name = "";
        this.ID = "";
        this.account = null;
    }

    public BankTeller(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.account = null;
    }

    public BankTeller(String name, String ID, CustomerAccount account) {
        this.name = name;
        this.ID = ID;
        this.account = account;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setID(String newID)
    {
        this.ID = newID;
    }

    public void setAccount(CustomerAccount newAccount)
    {
        this.account = newAccount;
    }

    public String getName()
    {
        return name;
    }

    public String getID()
    {
        return ID;
    }

    public String getAccount()
    {
        return account;
    }
    
    public void addBalance(double deposit)
    {
        double newbal = this.account.getBalance() + deposit;
        BigDecimal rounded = new BigDecimal(newbal);
        this.account.setBalance(rounded.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

    public String toString() {
        return "Name: " + name + " | ID: " + ID;
    }
}