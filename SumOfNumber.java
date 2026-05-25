package day1;
import java.util.Scanner;
/**
 * 
 */
public class SumOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		while (num>0) {
			sum += num%10;
			num = num/10;
		}
		System.out.println("The sum is : " + sum);
	}
}
