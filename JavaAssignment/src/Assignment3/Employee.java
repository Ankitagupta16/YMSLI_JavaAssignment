package Assignment3;

public abstract class Employee implements Payable {

	String name;
	String empID;
	
	public Employee(String name, String empID) {
		this.name = name;
		this.empID = empID;
	}
	
	public abstract double getSalary();
	public abstract void setSalary(float rate);
	public abstract void increaseSalary(float rate);
}
