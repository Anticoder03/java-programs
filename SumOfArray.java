package day1;
import java.util.Iterator;
import java.util.Scanner;
public class SumOfArray {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int sum = 0;
		
//		for (int i=0;i<arr.length;i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);
//		for (int i : arr) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		int daily[] = {100,200,300,400,500,600,700,800};
		int Bill = 800;
		
		for (int i=0;i<daily.length;i++) {
			sum += daily[i];
			if(sum >= Bill){
				System.out.println("day : " + (i+1));
				break;
			}
		}
	}
}
