package assignment2;

public class Vehicle {
	int noOfWheel;
	int noOfPassenger;
	int model;
	String make;
	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}
	
	public void display()
	{
		System.out.println("Make: "+ make);
		System.out.println("Model: "+ model);
		System.out.println("Number of Passenger: "+ noOfPassenger);
		System.out.println("Number Of Wheel: "+ noOfWheel);
	}
	
}
