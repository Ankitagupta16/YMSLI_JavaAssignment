package assignment2;

public class Circle {
	double radius=1.0;
	String color="red";
	
	public Circle()
	{
		
	}
	
	public Circle(double r)
	{
		radius=r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return 3.14*radius*radius;
	}
}
