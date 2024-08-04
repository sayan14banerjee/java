import java.util.Scanner;

public class PrimeNumbers {
    
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print the first n prime numbers, their sum and average
    public static void printPrimes(int n) {
        int count = 0;  // Count of prime numbers found
        int num = 2;    // Starting number to check for primes
        int sum = 0;    // Sum of prime numbers

        System.out.println("The first " + n + " prime numbers are:");

        // Loop until we find n prime numbers
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                sum += num;
                count++;
            }
            num++;
        }

        double average = (double) sum / n;  // Calculate average

        System.out.println("\nSum of the first " + n + " prime numbers: " + sum);
        System.out.println("Average of the first " + n + " prime numbers: " + average);
    }

    // Main method to test the printPrimes method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        printPrimes(n);
    }
}
