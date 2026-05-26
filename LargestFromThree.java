package day1;

public class LargestFromThree {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		if (arr[0] > arr[1]) {
			if(arr[0] > arr[3]) {
				System.out.println(arr[0] + " is the largest");
			}
		}
		else if (arr[1] > arr[0]) {
			if (arr[1] > arr[2]) {
				System.out.println(arr[1] + "is the largest.");
			}
			
		}
		else {
		
			
			System.out.println(arr[2] + "is largest");
		}
	}
}
