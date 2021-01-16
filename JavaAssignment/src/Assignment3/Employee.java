package Assignment3;

public abstract class Employee {

	String name;
	String empID;
	
	public Employee(String name, String empID) {
		this.name = name;
		this.empID = empID;
	}
	
	public abstract void increaseSalary(float rate);
}
