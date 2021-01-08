package day1and2;

import java.util.Scanner;

public class SumAverageRunningInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int lowerbound = sc.nextInt();
		int upperbond = sc.nextInt();
		int sum = 0;
		double average = 0;
		int count =0;
		
		for(int i =lowerbound; i<=upperbond;i++)
		{	sum+=i;
			count ++;
		}
		
		average = sum/count;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+ average);
	}
}
