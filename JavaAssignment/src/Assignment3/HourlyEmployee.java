package Assignment3;

public class HourlyEmployee extends Employee implements Payable {

	float hourlyRate;
	double hourlySalary;
	public HourlyEmployee(String name, String empID, float hourlyRate, double hourlySalary) {
		super(name, empID);
		this.hourlyRate = hourlyRate;
		this.hourlySalary = hourlySalary;
	}
	
	@Override
	public double getPaymentAmount(float noOfHours) {
		
		hourlySalary += hourlyRate*noOfHours;
		return hourlySalary;
	}
	
	@Override
	public void increaseSalary(float rate) {
		hourlyRate += rate;
		System.out.println("Weekly Rate Increased");
	}
}
