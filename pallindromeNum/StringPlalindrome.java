package pallindromeNum;

import java.util.Scanner;

public class StringPlalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		String org_string = str;
		String rev = "";

		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if(org_string.equals(rev)) { ////or we can also use org_string.equals(rev))
			System.out.println(org_string+ " is a palindrome string");
		}
		else
		{
			System.out.println(org_string+ " is not a palindrome string");
		}

	}

}
