import java.util.Scanner;

public class SecondLargestNumber {

    // Method to find the second largest number in an array
    public static int findSecondLargest(int[] array) {
        int firstLargest, secondLargest;

        // Initialize the first and second largest numbers
        if (array[0] > array[1]) {
            firstLargest = array[0];
            secondLargest = array[1];
        } else {
            firstLargest = array[1];
            secondLargest = array[0];
        }

        // Iterate through the array starting from the second index
        for (int i = 2; i < array.length; i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if (array[i] > secondLargest && array[i] != firstLargest) {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }

    // Main method to test the findSecondLargest method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        if (size < 2) {
            System.out.println("Array must have at least two elements.");
        } else {
            int secondLargest = findSecondLargest(array);
            System.out.println("The second largest number in the array is: " + secondLargest);
        }
    }
}
