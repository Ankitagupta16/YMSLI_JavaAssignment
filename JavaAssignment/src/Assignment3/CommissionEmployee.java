package Assignment3;

public class CommissionEmployee extends Employee implements Payable {
		
	double salary;
	float percentage;
	public CommissionEmployee(String name, String empID, double salary, float percentage) {
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
	
}
