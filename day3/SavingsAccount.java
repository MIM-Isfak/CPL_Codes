public class SavingsAccount extends BankAccount 
{
    public SavingsAccount(String accountID, String accountHolderName, BankAccount.CustomerType customerType, double balance) 
	{
        super(accountID, accountHolderName, customerType, balance);
        this.interestRate = 0.05;
    }
}