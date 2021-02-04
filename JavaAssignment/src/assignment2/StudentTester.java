package assignment2;

import java.util.*;

public class StudentTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Creating student object
		System.out.println("Menu");
		System.out.println("1: Create student with name");
		System.out.println("2: Create student with name and id");
		System.out.println("3: Create student with name , id and grade");
		int choice = sc.nextInt();
		Student student = null;
		switch(choice)
		{
		case 1: {
			System.out.println("Enter name");
			String name = sc.next();
			student= new Student(name);
			break;
		}
		case 2: {
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter ID");
			String id = sc.next();
			student= new Student(name,id);
			break;
		}
		case 3: {
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("Enter ID");
			String id = sc.next();
			System.out.println("Enter grade");
			double grade = sc.nextDouble();
			student= new Student(name,id,grade);
			break;
		}
		default: System.out.println("Wrong choice!!!!!!!");
		}
		
		
		//display options
		System.out.println("Display options:");
		System.out.println("1: Display details with year info");
		System.out.println("2: Display details without year info");
		choice = sc.nextInt();

		switch(choice)
		{
		case 1: {
			System.out.println("Enter year");
			int year = sc.nextInt();
			student.display(year);
			break;
		}
		case 2: {
			student.display();
			break;
		}
		default: System.out.println("Wrong choice!!!!!!!");
		}
		
		
		sc.close();
	}
}
