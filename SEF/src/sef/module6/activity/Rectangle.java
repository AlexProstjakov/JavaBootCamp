package sef.module6.activity;

public class Rectangle extends Shape{
	
	private double length;
	private double breadth;
	
	
	public Rectangle() {
	}

	public Rectangle(double length, double breadth) {
		this.length=length;
		this.breadth=breadth;
		System.out.println("Rectangle initialized - side sizes defined");
	}
	
	public double calculateArea() {
		double area = length*breadth;
		return area;
	}
		
	public double calculatePerimeter() {
		double per = 2*(length+breadth);
		return per;
	}

	protected double getLength() {
		return length;
	}

	protected void setLength(double length) {
		this.length = length;
	}

	protected double getBreadth() {
		return breadth;
	}

	protected void setBreadth(double breadth) {
		this.breadth = breadth;
	}

}
