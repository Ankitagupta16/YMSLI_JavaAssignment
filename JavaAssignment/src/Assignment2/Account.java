package Assignment2;

public abstract class Account {
	String memberName;
	int accountNumber;
	double accountBalance;
	
	
	
	public Account(String memberName, int accountNumber, double accountBalance)
	{
		this.memberName = memberName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}



	public String getMemberName() {
		return memberName;
	}



	public int getAccountNumber() {
		return accountNumber;
	}



	public double getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}



	public void deposit(double amount)
	{
		accountBalance+= amount;
	}
	
	abstract public void withdraw(double amount);
	abstract public double getBalance();
}
