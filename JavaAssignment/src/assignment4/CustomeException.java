package assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyInputExceptions extends Exception 
{ 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyInputExceptions(String msg) 
    { 
        super(msg); 
    } 
} 
public class CustomeException {
	public static void main(String[] args) {
		boolean flag=true;
		int number=0;
		Scanner sc=new Scanner(System.in);
		do
		{
			try
			{
				System.out.println("“Please enter a number or enter ‘-1’ if you want to quit” : ");
				number=sc.nextInt();
				try
				{
						if(number>100)
							throw new MyInputExceptions("“Number can’t be greater than 100”."); 
						else {
								if(number==-1)
								{
									flag=false;
									continue;
								}
								if(number%2==0)
									System.out.println("“You must enter an even integer. ”");
								else
									System.out.println("“You have entered an odd number. ”");
									
								}
				}
				catch (MyInputExceptions ex) 
		        { 
		            System.out.println(ex.getMessage()); 
		        } 
			
			}
			catch(InputMismatchException e)
			{
				System.out.println("“You must enter an integer.”");
			}
			
			sc.nextLine();
		}while(flag);
		System.out.println("Thanks for coming.");
		
		sc.close();
	}
}
