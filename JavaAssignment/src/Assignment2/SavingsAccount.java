package Assignment2;

public class SavingsAccount extends Account{
	int interest = 5;
	double MaximumWithdrawLimit;
	double minimumLimit;
	public SavingsAccount(String memberName, int accountNumber, double accountBalance, int interest,
			double MaximumWithdrawLimit,double minimumLimit) {
		super(memberName, accountNumber, accountBalance);
		this.interest = interest;
		this.MaximumWithdrawLimit = MaximumWithdrawLimit;
		this.minimumLimit = minimumLimit;
	}
	
	@Override
	public double getBalance() {
		double totalBalance = (interest*accountBalance)/100+accountBalance;
		return totalBalance;
	}
	
	@Override
	public void withdraw(double amount)
	{
		
		if (amount<MaximumWithdrawLimit)
		{
			double balance =getAccountBalance()-amount;
			if(balance >minimumLimit)
			{
				setAccountBalance(balance);
				System.out.println("Withdrawl successful"); 
			}
			else
			{
				System.out.println("Unable to withdraw amount as account balance is going below minimum limit");
			}
		}
		else
		{
			System.out.println("Unable to withdraw amount as Maximum Withdraw Limit is crossed");
		}
		
	}
}
