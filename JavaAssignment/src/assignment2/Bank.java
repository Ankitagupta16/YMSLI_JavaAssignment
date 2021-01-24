package assignment2;

import java.util.*;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.next();
		
		System.out.println("Choose one: ");
		System.out.println("1: Savings Account");
		System.out.println("2: Current Account");
		int choice = sc.nextInt();
		
		Random random = new Random();
		int AccountNum = 10000 + random.nextInt(89999);
		System.out.println("Enter initial balance: ");
		double balance = sc.nextDouble();
		Account account=null;
		if (choice == 1) {
			account = new SavingsAccount(name, AccountNum, balance, 5, 20000, 5000);
		} else if (choice == 2) {
			System.out.println("Enter liscense number");
			int liscense = sc.nextInt();
			account = new CurrentAccount(name, AccountNum, balance, liscense);
		} else
			System.out.println("Wrong choice!!!");
		
		
		String option =null;
		do
		{
			System.out.println("Menu");
			System.out.println("1: Deposit money");
			System.out.println("2: Withdraw money");
			System.out.println("3: Display balance");
			System.out.println("0: exit system");
			int MenuChoice= sc.nextInt();
			
			switch(MenuChoice)
			{
			case 1:{
				System.out.println("Enter amount:");
				double amount = sc.nextDouble();
				account.deposit(amount);
				System.out.println("Amount Deposited Sucessfully......");
				break;
			}
			case 2:{
				System.out.println("Enter amount:");
				double amount = sc.nextDouble();
				account.withdraw(amount);
				break;
			}
			case 3:System.out.println(account.getBalance());break;
			case 0:System.exit(0);
				default: System.out.println("Wrong choice!!!!!!!!!!!!");
			}
			
			System.out.println("Want to continue (yes/no)");
			option = sc.next();
		}while(option.equals("yes")|| option.equals("yes"));
		
		
		
		
		
		
		
		
		sc.close();                     
	}
}
