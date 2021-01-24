package Assignment2;

public class CurrentAccount extends Account {
	int tradeLicenseNumber;

	public CurrentAccount(String memberName, int accountNumber, double accountBalance, int tradeLicenseNumber) {
		super(memberName, accountNumber, accountBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
	
	@Override
	public double getBalance()
	{
		return getAccountBalance();
	}
	
	@Override
	public void withdraw(double amount)
	{
		
		if (amount<getAccountBalance())
		{
			setAccountBalance(amount);
			System.out.println("Withdrawl successful"); 
		}
		else
		{
			System.out.println("Not enough balance for this withdrawal");
		}
	}
}
