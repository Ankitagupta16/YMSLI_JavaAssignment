package assignment3;

public class SalariedEmployee extends Employee{
	
	float weeklyRate;
	double weeklySalary;
	public SalariedEmployee(String name, String empID, float weeklyRate, double weeklySalary) {
		super(name, empID);
		this.weeklyRate = weeklyRate;
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double getPaymentAmount(float noOfWeeks) {
		
		weeklySalary += weeklyRate*noOfWeeks;
		return weeklySalary;
	}
	
	@Override
	public void increaseSalary(float rate) {
		weeklyRate += rate;
		System.out.println("Weekly Rate Increased");
	}

	@Override
	public double getSalary() {
		
		return weeklySalary;
	}

	@Override
	public void setSalary(float rate) {
		weeklyRate = rate;
		System.out.println("Weekly Rate Updated");
		
	}
}
