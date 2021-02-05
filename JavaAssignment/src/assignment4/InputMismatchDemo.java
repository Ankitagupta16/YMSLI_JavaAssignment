package assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {
public static void main(String[] args) {
	int x;
	Scanner sc=new Scanner(System.in);
	try
	{
		while(true)
		{
			System.out.println("“Please enter a number or enter ‘-1’ if you want to quit” : ");
			x=sc.nextInt();
			if(x==(-1))
			{
				System.out.println("Quiting program!!");
				break;
			}
			else if(x%2==0)
			{
				System.out.println("You have Entered Even Number");
			}
			else if(x%2!=0)
			{
				System.out.println("You have entered Odd number");
			}
		}
	}
	catch(InputMismatchException e)
	{
		sc.next();
		System.out.println("You must enter a Integer");
	}
	sc.close();
}
}
