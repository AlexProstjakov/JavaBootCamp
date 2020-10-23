package sef.module17.sample;

import junit.framework.TestCase;

public class MyCalculatorTest2 extends TestCase{
	
	private MyCalculator myCalc;

	
	public void setUp() throws Exception {
		super.setUp();
		myCalc = new MyCalculator();
	}

	
	public void tearDown() throws Exception {
		super.tearDown();
	}

	
	public void testGetSum() {
		int a = 3;
		int b = 2;
		assertEquals(5, (myCalc.getSum(a,b)));
		
	}
	
	public void testGetDifference() {
		int a = 56;
		int r = 24;
		
		assertEquals(32,myCalc.getDifference(a, r));
		assertNotNull(myCalc.getDifference(r, a));
	}
	public void testGetQuotient() {
		double a = 6.0;
		double b = 3.0;
		
		assertEquals(2.0,myCalc.getQuotient(a, b));
		
	}

}
