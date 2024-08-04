import java.util.Scanner;

public class FloydsTriangle {

    // Method to print Floyd's Triangle
    public static void printFloydsTriangle(int rows) {
        int number = 1;  // Starting number to print

        System.out.println("Floyd's Triangle:");
        for (int i = 1; i <= rows; i++) {  // Outer loop for each row
            for (int j = 1; j <= i; j++) {  // Inner loop for each column in the current row
                System.out.print(number + " ");
                number++;
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    // Main method to test the printFloydsTriangle method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int rows = scanner.nextInt();
        scanner.close();

        printFloydsTriangle(rows);
    }
}

