package YetAnotherProgNotes.OOPSBasics;

import java.util.Scanner;

public class Series1toN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number= sc.nextInt();
		
		while(number>0)
			System.out.print(number--+" ");
		
		sc.close();
	}
}
