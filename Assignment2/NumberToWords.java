import java.util.Scanner;

public class NumberToWords {
    // Array to store the words for digits 0-9
    private static final String[] DIGIT_WORDS = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine"
    };

    // Method to convert a number to words
    public static String numberToWords(int number) {
        // Handle the case for zero
        if (number == 0) {
            return DIGIT_WORDS[0];
        }

        // Handle negative numbers
        String sign = "";
        if (number < 0) {
            sign = "minus ";
            number = -number;
        }

        // StringBuilder to store the result
        StringBuilder words = new StringBuilder();

        // Process each digit
        while (number > 0) {
            int digit = number % 10;
            words.insert(0, DIGIT_WORDS[digit] + " ");
            number /= 10;
        }

        // Add the sign if the number was negative
        return sign + words.toString().trim();
    }

    // Main method to test the numberToWords method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        System.out.println("Number in words: " + numberToWords(number));
    }
}
