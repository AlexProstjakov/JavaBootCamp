package sef.FinalActivity;

import junit.framework.TestCase;

public class SecondActivityTest extends TestCase{
	
	private SecondActivity calculator;


	public void setUp() throws Exception {
		super.setUp();
		calculator = new SecondActivity();
	}

	
	public void tearDown() throws Exception {
		super.tearDown();
	}

	
	public void testgetSum() {
		
		int a=3;
		int b=6;
		assertEquals(9, calculator.getSum(a, b));
		assertEquals(9, calculator.getSum(b, a));
		
		a= -4;
		b= 5;
		assertEquals(1, calculator.getSum(a, b));
		assertEquals(1, calculator.getSum(b, a));
		
		a= -7;
		b= -5;
		assertEquals(-12, calculator.getSum(a, b));
		assertEquals(-12, calculator.getSum(b, a));
	}
	
	public void testgetDifference() {
		
		int a=3;
		int b=6;
		assertEquals(-3, calculator.getDifference(a, b));
		assertEquals(3, calculator.getDifference(b, a));
		
		a= -4;
		b= 5;
		assertEquals(-9, calculator.getDifference(a, b));
		assertEquals(9, calculator.getDifference(b, a));
		
		a= -7;
		b= -5;
		assertEquals(-2, calculator.getDifference(a, b));
		assertEquals(2, calculator.getDifference(b, a));
	}
	
	public void testgetProduct() {
		double a=3;
		double b=6;
		assertEquals(18.0, calculator.getProduct(a, b));
		assertEquals(18.0, calculator.getProduct(b, a));
		
		a= -4;
		b= 5;
		assertEquals(-20.0, calculator.getProduct(a, b));
		assertEquals(-20.0, calculator.getProduct(b, a));
		
		a= -7;
		b= -5;
		assertEquals(35.0, calculator.getProduct(a, b));
		assertEquals(35.0, calculator.getProduct(b, a));
	}
	
	public void testgetDividend() {
		double a=3;
		double b=6;
		assertEquals(0.5, calculator.getDividend(a, b));
		assertEquals(2.0, calculator.getDividend(b, a));
		
		a= -4;
		b= 16;
		assertEquals(-0.25, calculator.getDividend(a, b));
		assertEquals(-4.0, calculator.getDividend(b, a));
		
		a= -10;
		b= -5;
		assertEquals(2.0, calculator.getDividend(a, b));
		assertEquals(0.5, calculator.getDividend(b, a));
	}
	
	public void testDivByZero() {
		double a=3;
		double b=0;
		
		try {
			calculator.getDividend(a, b);
		}catch(ArithmeticException e){
			System.out.println("Division by 0 is not allowed!");
		}
	}
	
	
	
	
	
	

}
