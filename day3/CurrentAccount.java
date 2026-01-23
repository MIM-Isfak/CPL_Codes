public class CurrentAccount extends BankAccount 
{
    private int chequeNoStart;
    private int chequeNoEnd;

    public CurrentAccount(String accountID, String accountHolderName, BankAccount.CustomerType customerType, double balance, int chequeNoStart, int chequeNoEnd) 
	{
        super(accountID, accountHolderName, customerType, balance);
        this.chequeNoStart = chequeNoStart;
        this.chequeNoEnd = chequeNoEnd;
    }

    // Deposit cheque method
    public void depositCheque(int chequeNo, double amount) 
	{
        if (chequeNo >= chequeNoStart && chequeNo <= chequeNoEnd) 
		{
            balance += amount;
            System.out.println("Cheque deposited: " + amount);
        } 
		else 
		{
            System.out.println("Invalid cheque number!");
        }
    }
}

