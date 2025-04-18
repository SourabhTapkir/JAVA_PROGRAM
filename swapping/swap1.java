package swapping;

public class swap1 {

	public static void main(String[] args) {
		
		//using third variable
//		int a = 1;
//		int b = 3;
//		int temp;
//
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("a = "+a+ "\nb = " +b);
		
		
		//// without using third variable
		int a = 50;
		int b = 40;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = "+a+ "\nb = "+b);
		

	}

}
