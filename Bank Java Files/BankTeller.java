import java.math.BigDecimal;

public class BankTeller {
    private String name;
    private String ID;
    private static int count = 0;
      
    public BankTeller() {
      this.name = "";
      this.ID = "";
      count ++;
    }
    
    public BankTeller(String name, String ID) {
      this.name = name;
      this.ID = ID;
      count ++;
    }
    
    public static int getCount() {
      return count;
    }
        
    public void setName(String newName)
    {
      this.name = newName;
    }

    public void setID(String newID)
    {
      this.ID = newID;
    }

    public String getName()
    {
      return name;
    }

    public String getID()
    {
      return ID;
    }
    
    public void addBalance(CustomerAccount account, double deposit)
    {
      double newbal = account.getBalance() + deposit;
      BigDecimal rounded = new BigDecimal(newbal);
      account.setBalance(rounded.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
    }

    public void withdrawBalance(CustomerAccount account, double withdrawal)
    {
      double newbal = account.getBalance() - withdrawal;
      BigDecimal rounded = new BigDecimal(newbal);
      account.setBalance(rounded.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
    }
    
    public double getBalance(CustomerAccount account)
    {
      return account.getBalance();
    }
    
    public String toString() {
      return "Name: " + name + " | ID: " + ID;
    }
}
