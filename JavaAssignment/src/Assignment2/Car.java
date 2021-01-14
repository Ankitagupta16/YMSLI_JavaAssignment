package Assignment2;

public class Car extends Vehicle{
	int noOfDoor;

	public Car(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
	}
	
	
	@Override
	public void display()
	{
		System.out.println("Make: "+ make);
		System.out.println("Model: "+ model);
		System.out.println("Number of Door: "+ noOfDoor);
	}
	
}
