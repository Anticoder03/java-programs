package day1;

public class SwapNumbers {
	public static void main(String[] args) {
		int a=23,b=45,c;
		System.out.println("Before Swaping a: " + a);
		System.out.println("Before Swaping b: " + b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After Swaping a: " + a);
		System.out.println("After Swaping b: " + b);
		
		
	}
}
