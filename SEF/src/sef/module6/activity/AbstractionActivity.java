package sef.module6.activity;

//I went a bit further in the exercise by creating 
//two instances of a rectangle with different parameters.

public class AbstractionActivity {

	public static void main(String[] args) {
		
		Shape a = new Rectangle(5,6);
		Shape b = new Rectangle(20,10);
		
		System.out.println("------------------------");
		
		a.setColor("Blue");
		b.setColor("Red");
		String color=a.getColor();
		String color1=b.getColor();
		System.out.println("Shape (a) color is "+color);
		System.out.println("Shape (b) color is "+color1);
		
		System.out.println("------------------------");
		
		a.calculateArea();
		a.calculatePerimeter();
		b.calculateArea();
		b.calculatePerimeter();
		
		System.out.println("Area of (a)is "+a.calculateArea());
		System.out.println("Perimeter of (a) is "+a.calculatePerimeter());
		
		System.out.println("------------------------");
		
		System.out.println("Area of (b) is "+b.calculateArea());
		System.out.println("Perimeter (b) is "+b.calculatePerimeter());

	}

}
