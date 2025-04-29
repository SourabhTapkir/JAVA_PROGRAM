package armstrong;

public class Armstrong {
	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int r;
		int sum=0;
		
	while(n>0) {
		r = n%10; // to separate the number and to get last digit 3
		n = n/10;
		sum = sum + r*r*r;
	}
	if(temp == sum) {
		System.out.println("Its an Armstrong Number");
	}
	else {
		System.out.println("Not an Armstrong Number");
	}
		
		
	}
	

}
