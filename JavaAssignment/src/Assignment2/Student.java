package Assignment2;

public class Student {

	String name;
	String id;
	double grade;
	public Student(String name, String id, double grade) {
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public Student(String name) {
		this.name = name;
	}
	
	public void display() {
		if(name!=null)
			System.out.println("Name: "+name);
		if(id!=null)
			System.out.println("ID: "+id);
		if(grade!=0.0)
			System.out.println("Grade: "+grade);
	}
	
	public void display(int year)
	{
		System.out.println("Year:  "+ year);
		display();
	}
	
}
