package sef.FinalActivity;

public class ThirdActivity {

	public static void main(String[] args) {
		
		try {
			int a = 1;
			int b = 0;
			System.out.println(a/b);
		}catch(ArithmeticException e){
			System.out.println("Div by 0!");
			e.printStackTrace();
		}
		
		int array1[] = {1,2,3,4,5,6,7};
		
		try{
			for(int i=0; i<8; i++) {
				System.out.println(array1[i]);
			}
		}catch(ArrayIndexOutOfBoundsException t){
			System.out.println("Array index out of bounds");
			t.printStackTrace();
			
		}
			
		}
	
		
		
		

	}


