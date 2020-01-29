public class CustomerAccount {
    private String name;
    private int accountNumber;
    private String ID;
    private double balance;
    private String type;

    public CustomerAccount() {
        this.name = "";
        this.accountNumber = "";
        this.ID = "";
        this.balance = "";
        this.type = "";
    }
    
    public CustomerAccount(String name, int accountNumber, String ID, double balance, String type) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.ID = ID;
        this.balance = balance;
        this.type = type;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setAccountNumber(int newAccountNumber)
    {
        this.accountNumber = newAccountNumber;
    }

    public void setID(String newID)
    {
        this.ID = newID;
    }
    
    public void setBalance(double newBalance)
    {
        this.balance = newBalance;
    }

    public void setType(String newType)
    {
        this.type = newType;
    }

    public String getName()
    {
        return name;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public String getID()
    {
        return ID;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getType()
    {
        return type;
    }

    public String toString() {
        return "Name: " + name + " | Account Number: " + accountNumber + " | ID: " + ID + " | Balance: " + balance + " | Type: " + type;
    }
}