package Assignment2;

public class Convertible extends Car{
	boolean isHoodOpen;

	public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen = isHoodOpen;
	}
	
	@Override
	public void display()
	{
		System.out.println("Make: "+ make);
		System.out.println("Model: "+ model);
		System.out.println("Number of Door: "+ noOfDoor);
		System.out.println("Is Hood Open: "+isHoodOpen);
	}
	
}
