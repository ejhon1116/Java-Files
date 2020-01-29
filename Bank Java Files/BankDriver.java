public class BankDriver
{
    public static void main(String[] args)
    {
        CustomerAccount Bob = new CustomerAccount("Bob", 1039, "1a8fnB4", 32648.98, "Savings");
        BankTeller John = new BankTeller("John", "14893", Bob);
        Branch GreatNeck = new Branch("3 Elm Street", "848-599-6969", John);
        Bank chase = new Bank("Chase", GreatNeck);
        John.addBalance(1000);
        System.out.println(chase.toString());
    }
}
