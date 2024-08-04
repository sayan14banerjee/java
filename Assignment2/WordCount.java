import java.util.Scanner;

public class WordCount {

    // Method to count the number of words in a string
    public static int countWords(String str) {
        // Trim the string to remove leading and trailing spaces
        str = str.trim();

        // Check if the string is empty
        if (str.isEmpty()) {
            return 0;
        }

        // Split the string by one or more spaces using regex
        String[] words = str.split("\\s+");

        // Return the length of the resulting array
        return words.length;
    }

    // Main method to test the countWords method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int wordCount = countWords(input);
        System.out.println("The number of words in the string is: " + wordCount);
    }
}
