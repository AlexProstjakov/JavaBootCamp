/**
 * 
 */
package sef.module3.activity;

/**
 * @author
 *
 */
public class FindLargest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Find Largest of two numbers
				
		int num1 = 1, num2 = 2;

		if (num1 > num2) {
			System.out.println(num1 + " is largest of two numbers");
		} else {
			System.out.println(num2 + " is largest of two numbers");
		}

		// Find Largest of three numbers
				
		int i = 1, j = 2, k = 10;
		
		if (i > j) {
			if (i>k)
			{
				System.out.println(i + " is Largest of three numbers");
			} else {
				System.out.println(k+ " is Largest of three numbers");
			}
		} else {
			if (j>k)
			{
				System.out.println(j+ " is Largest of three numbers");
			} else {
				System.out.println(k+ " is Largest of three numbers");
			}
		}
		
		int a=4, b=1, c=2, d=3;
		
		if (a>b) {
			if (a>c) {
				if (a>d) {
					System.out.println(a + " is Largest of four numbers");
				}else {
					System.out.println(d + " is Largest of four numbers");
				}
			}else {
				if (c>d) {
					System.out.println(c + " is Largest of four numbers");
				}else {
					System.out.println(d + " is Largest of four numbers");
				}
			}
		}else {
			if (b>c) {
				if (b>d) {
					System.out.println(b + " is Largest of four numbers");
				}else System.out.println(d + " is Largest of four numbers");
			}else {
				if (c>d) {
					System.out.println(c + " is Largest of four numbers");
				}else {
					System.out.println(d + " is Largest of four numbers");
				}
			}
		}
	}
}
