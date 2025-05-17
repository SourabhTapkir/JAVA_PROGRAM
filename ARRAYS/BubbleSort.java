package arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] my_arr = { 10, 44, 5, 67, 88, 1, 60, 22 };
		int n = my_arr.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				if (my_arr[j] > my_arr[j + 1]) {
					int temp = my_arr[j];
					my_arr[j] = my_arr[j + 1];
					my_arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Arr::");
		for (int i = 0; i < n; i++) {
			System.out.println(my_arr[i]);
		}
	}
}
