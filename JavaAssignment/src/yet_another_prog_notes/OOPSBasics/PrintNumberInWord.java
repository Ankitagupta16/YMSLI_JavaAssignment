/*Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" 
if the int variable "number" is 1, 2,... , 9, or other, respectively. 
*/
package yet_another_prog_notes.OOPSBasics;

import java.util.Scanner;

public class PrintNumberInWord {
	
	public static void showWord(int number)
	{
		switch(number)
		{
		case 1: System.out.println("ONE"); break;
		case 2: System.out.println("TWO"); break;
		case 3: System.out.println("THREE"); break;
		case 4: System.out.println("FOUR"); break;
		case 5: System.out.println("FIVE"); break;
		case 6: System.out.println("SIX"); break;
		case 7: System.out.println("SEVEN"); break;
		case 8: System.out.println("EIGHT"); break;
		case 9: System.out.println("NINE"); break;
		default: System.out.println("OTHER"); 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		sc.close();
		showWord(number);
		
	}
}
