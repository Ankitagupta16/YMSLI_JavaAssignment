package day1and2;

public class Fibonacci {
	public static void printFibonacciSeries(int number)
	{
		int f1=1;
		int f2=1;
		int temp = 0;
		float sum=f1+f2;
		
		System.out.println("The first 20 Fibonacci numbers are:");
		System.out.print(f1+" ");
		
		for(int i=2;i<number;i++)
		{
			temp = f1+f2;
			sum+=temp;
			System.out.print(temp+" ");
			f1=f2;
			f2=temp;
		}
		
		System.out.println();
		System.out.print("The average is "+ sum/number);
		
	}
	
	public static void main(String[] args) {
		printFibonacciSeries(20);
	}
}
