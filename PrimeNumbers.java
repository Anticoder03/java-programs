package day1;

public class PrimeNumbers {

    public static void main(String[] args) {

        int[] primes = new int[5];
        int[] numbers = {1, 5, 7, 9, 11};

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (checkPrime(numbers[i])) {
                primes[index] = numbers[i];
                index++;
            }
        }

        System.out.println("Prime Numbers:");

        for (int i = 0; i < index; i++) {
            System.out.println(primes[i]);
        }
    }

    private static boolean checkPrime(int n1) {

        if (n1 <= 1) {
            return false;
        }

        int counter = 0;

        for (int i = 1; i <= n1; i++) {

            if (n1 % i == 0) {
                counter++;
            }
        }

        return counter == 2;
    }
}