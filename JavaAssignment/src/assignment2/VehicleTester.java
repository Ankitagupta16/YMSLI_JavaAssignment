package Assignment2;

import java.util.Scanner;

public class VehicleTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("‘1’ – create a Vehicle object.");
		System.out.println("‘2’ – create a Car object.");
		System.out.println("‘3’– create a Convertible object.");
		System.out.println("‘4’– create a SportCar object.");
		int choice = sc.nextInt();
		
		Vehicle vehicle = null;
		
		switch(choice)
		{
		case 1:{
			System.out.println("Enter Number of wheel");
			int noOfWheel = sc.nextInt();
			System.out.println("Enter Number of Passenger");
			int noOfPassenger = sc.nextInt();
			System.out.println("Enter Number of Model");
			int model = sc.nextInt();
			System.out.println("Enter name of Make");
			String make = sc.next();
			
			vehicle= new Vehicle(noOfWheel,noOfPassenger,model,make);
			break;
		}
		case 2:{
			System.out.println("Enter Number of wheel");
			int noOfWheel = sc.nextInt();
			System.out.println("Enter Number of Passenger");
			int noOfPassenger = sc.nextInt();
			System.out.println("Enter Number of Model");
			int model = sc.nextInt();
			System.out.println("Enter name of Make");
			String make = sc.next();
			System.out.println("Enter Number of Door");
			int noOfDoor = sc.nextInt();
			
			vehicle= new Car(noOfWheel,noOfPassenger,model,make,noOfDoor);
			break;
		}
		case 3:{
			System.out.println("Enter Number of wheel");
			int noOfWheel = sc.nextInt();
			System.out.println("Enter Number of Passenger");
			int noOfPassenger = sc.nextInt();
			System.out.println("Enter Number of Model");
			int model = sc.nextInt();
			System.out.println("Enter name of Make");
			String make = sc.next();
			System.out.println("Enter Number of Door");
			int noOfDoor = sc.nextInt();
			System.out.println("Is Hood Open? (true/false)");
			boolean isHoodOpen = sc.nextBoolean();
			
			vehicle= new Convertible(noOfWheel,noOfPassenger,model,make,noOfDoor,isHoodOpen);
			break;
		}
		case 4:{
			System.out.println("Enter Number of wheel");
			int noOfWheel = sc.nextInt();
			System.out.println("Enter Number of Passenger");
			int noOfPassenger = sc.nextInt();
			System.out.println("Enter Number of Model");
			int model = sc.nextInt();
			System.out.println("Enter name of Make");
			String make = sc.next();
			
			vehicle= new SportCar(noOfWheel,noOfPassenger,model,make,2);
			break;
		}
		default: System.out.println("Wrong choice!!!!!");
		
		}
		
		vehicle.display();
		
		
		sc.close();
	}
}
