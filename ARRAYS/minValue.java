package arrays;

public class minValue {
	public static void main(String[] args) {
		int[] arr = {10,4,60,45,5};
		int minValue = arr[0]; 
		
		for(int i:arr) {
			if(i < minValue) {
				minValue=i;
			}
		}
		System.out.println("Minimum Value=" +minValue);
	}

}
