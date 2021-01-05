package day1and2;

import java.util.Scanner;

public class GradesAverage {

	public static void main(String[] args) {
		
		int numOfStudents=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		numOfStudents = sc.nextInt();
		int grades[] = new int[numOfStudents];
		
		int nthStudent=0;
		double gradeSum=0;
		while(nthStudent< numOfStudents)
		{
			
			System.out.print("Enter the grade for student "+(nthStudent+1) +": ");
			grades[nthStudent] = sc.nextInt();
			if(grades[nthStudent]>0 && grades[nthStudent]<100)
			{
				gradeSum +=grades[nthStudent];
				if(nthStudent< numOfStudents)
					nthStudent++;
			}
			else
				System.out.println("Invalid grade, try again...");
		}
		
		System.out.println("The average is: "+gradeSum/numOfStudents);
	}
}
