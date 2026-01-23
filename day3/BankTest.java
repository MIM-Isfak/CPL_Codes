public class BankTest 
{
    public static void main(String[] args) 
	{
        SavingsAccount sa = new SavingsAccount("A101", "Isfak", BankAccount.CustomerType.PERSONAL, 5000);

        CurrentAccount ca = new CurrentAccount("C201", "CompanyS", BankAccount.CustomerType.COMPANY, 10000, 1000, 2000);

        sa.deposit(2000);
        sa.withdraw(1000);

        ca.depositCheque(1500, 3000);

        sa.transfer(ca, 2000);

        System.out.println("Savings Balance: " + sa.getBalance());
        System.out.println("Current Balance: " + ca.getBalance());
    }
}
