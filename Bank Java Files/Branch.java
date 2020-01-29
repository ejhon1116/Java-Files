public class Branch {
    private String address;
    private String number;
    private BankTeller bankTeller;
    
    public Branch()
    {
        this.address = "";
        this.number = "";
        this.bankTeller = null;
    }

    public Branch(String address, String number, BankTeller bankTeller) {
        this.address = address;
        this.number = number;
        this.bankTeller = bankTeller;
    }
    
    public void setAddress(String newAddress)
    {
        this.address = newAddress;
    }

    public void setNumber(String newNumber)
    {
        this.number = newNumber;
    }
    
    public void setTeller(BankTeller newTeller)
    {
        this.bankTeller = newTeller;
    }

    public String getAddress()
    {
        return address;
    }

    public String getNumber()
    {
        return number;
    }

    public String getTeller()
    {
        return bankTeller;
    }

    public String toString() {
        return "Address: " + address + " | Number: " + number + " | Bank Teller: " + bankTeller;
    }
}
