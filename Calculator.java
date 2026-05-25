package day1;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		while (running) {

			System.out.println("Enter A Number: ");
			float num1 = sc.nextFloat();

			System.out.println("Enter A Number: ");

			System.out.println("Enter the operation +,-,*,/,% , q for quit");
			String op = sc.next().substring(0, 1);

			float num2 = sc.nextFloat();
			switch (op) {
			case "+": {

				System.out.println(num1 + num2);
				break;
			}
			case "-": {
				System.out.println(num1 - num2);
				break;
			}
			case "*": {

				System.out.println(num1 * num2);
				break;
			}
			case "/": {
				System.out.println(num1 / num2);
				break;
			}
			case "%": {

				System.out.println(num1 % num2);
				break;
			}
			case "q": {
				running = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}

		}
	}
}
