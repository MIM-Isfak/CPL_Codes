public class BankAccount 
{
    private String accountID;
    private String accountHolderName;
    private CustomerType customerType;
    protected double interestRate;
    private double annualCharges;
    protected double balance;

	public enum CustomerType
	{
		PERSONAL, GROUP, COMPANY
	}
	

    public BankAccount(String accountID, String accountHolderName, CustomerType customerType, double balance) 
	{
        this.accountID = accountID;
        this.accountHolderName = accountHolderName;
        this.customerType = customerType;
        this.balance = balance;

        // Annual charges based on customer type
        if (customerType == CustomerType.COMPANY) 
		{
            annualCharges = 5000.00;
        } 
		else 
		{
            annualCharges = 1000.00;
        }
    }


    public void deposit(double amount) 
	{
        if (amount > 0) 
		{
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Withdraw method (only if balance is enough)
    public void withdraw(double amount) 
	{
        if (amount <= balance) 
		{
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
		else 
		{
            System.out.println("Insufficient balance!");
        }
    }

    public void transfer(BankAccount targetAccount, double amount) 
	{
        if (amount <= balance) 
		{
            this.balance -= amount;
            targetAccount.balance += amount;
            System.out.println("Transfer successful!");
        } 
		else 
		{
            System.out.println("Transfer failed: insufficient balance.");
        }
    }

    public double getBalance() 
	{
        return balance;
    }
}
