package Assignment3;

public class CommissionEmployee extends Employee{
		
	double salary;
	float percentage;
	public CommissionEmployee(String name, String empID, float percentage, double salary) {
		super(name, empID);
		this.salary = salary;
		this.percentage = percentage;
	}
	
	@Override
	public double getPaymentAmount(float weeklySale) {
		salary += percentage*weeklySale;
		return salary;
	}
	
	@Override
	public void increaseSalary(float rate) {
		percentage += rate;
		System.out.println("Weekly Rate Increased");
	
	}

	@Override
	public double getSalary() {
		
		return salary;
	}

	@Override
	public void setSalary(float rate) {
		percentage = rate;
		System.out.println("Weekly Rate Updated");
		
	}
	
}
