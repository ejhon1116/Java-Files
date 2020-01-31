public class BankDriver
{
    public static void main(String[] args)
    {
        CustomerAccount Bob = new CustomerAccount("Bob", 1039, "1a8fnB4", 32648.98, "Savings");
        BankTeller John = new BankTeller("John", "14893");
        BankTeller Greg = new BankTeller("Greg", "14293");
        Branch GreatNeck = new Branch("3 Elm Street", "848-599-6969", John);
        Branch NYC = new Branch("1 Time Square", " 585-372-8767", Greg);
        Bank Chase = new Bank("Chase", GreatNeck);
        
        System.out.println("Bank: \n" + Chase + "\n");
        System.out.println("Customer Account: \n" + Bob + "\n");
        System.out.println("Branch: \n" + GreatNeck + "\n");
        System.out.println("Teller: \n" + John + "\n");
        System.out.println("Customer Bob's Balance: \n" + Bob.getBalance() + "\n");
        John.addBalance(Bob, 1000);
        System.out.println("Teller John deposits $1000 to Bob's account. New Account Balance: \n" + Bob.getBalance() + "\n");
        Greg.withdrawBalance(Bob, 25000);
        System.out.println("Teller Greg withdraws $25000 from Bob's account. New Account Balance: \n" + Bob.getBalance() + "\n");
        System.out.println("Number of Tellers: \n" + BankTeller.getCount() + "\n");
        System.out.println("Number of Branch: \n" + Branch.getCount());
    }
}
