package fibonacciSeries;

public class Fibonacci {
	public static void main(String[] args) {
		int Num= 10, FirstNum = 0, SecondNum=1;
		int NextNum;
		
		for(int i=1;i<=Num;i++) {
			System.out.print(FirstNum+ ",");
			NextNum = FirstNum + SecondNum;
			FirstNum = SecondNum;
			SecondNum = NextNum;
		}
	}

}
