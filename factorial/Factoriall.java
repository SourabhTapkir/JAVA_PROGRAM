package factorial;

import java.util.Scanner;

public class Factoriall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		int factorial = 1;
		
		for(int i=1;i<=num;i++) {
			factorial *= i;
		}
		System.out.println("Factorial of "+num+ " is " +factorial);
	}

}
