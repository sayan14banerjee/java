import java.util.Scanner;

public class PalindromeChecker {
    
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        // Get the reverse of the number
        int reversed = 0;
        int original = number;
        
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        // Check if original number is equal to its reverse
        return original == reversed;
    }

    // Main method to test the isPalindrome method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
