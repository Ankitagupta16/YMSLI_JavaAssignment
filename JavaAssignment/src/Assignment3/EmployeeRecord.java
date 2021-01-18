package Assignment3;
import java.util.*;
public class EmployeeRecord {
	public static void main(String[] args) {
		Employee emp1 = new SalariedEmployee("Aasha","F2001", 5, 50000.0);
		Employee emp2 = new HourlyEmployee("Anika","F2002", 5, 40000.0);
		Employee emp3 = new SalariedEmployee("Ansh","F2003", 8, 60000.0);
		Employee emp4 = new CommissionEmployee("Arush","F2004", 15, 10000.0);
		Employee emp5 = new SalariedEmployee("Aish","F2005", 3, 50000.0);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		 for (int i = 0; i < employeeList.size(); i++) 
	            System.out.println(employeeList.get(i).getPaymentAmount(3)); 

	}
}
