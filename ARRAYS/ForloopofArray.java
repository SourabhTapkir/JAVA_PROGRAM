package arrays;

import java.util.Scanner;
public class ForloopofArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int size = sc.nextInt();
		
		int [] number = new int[size];
		
		for(int i=0; i<size;i++) {
			System.out.println("Enter Number " + (i + 1)+ ":");
			number[i] = sc.nextInt();			
		}
		
		System.out.println("You Entered:");
		for(int num : number) {
			System.out.println(num);
		}
		sc.close();
	}

}
