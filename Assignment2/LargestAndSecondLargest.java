import java.util.Scanner;

public class LargestAndSecondLargest {

    // Method to find the largest and second largest numbers in an array
    public static void findLargestAndSecondLargest(int[] array) {
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

        System.out.println("The largest number is: " + firstLargest);
        System.out.println("The second largest number is: " + secondLargest);
    }

    // Main method to test the findLargestAndSecondLargest method
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        if (size < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        findLargestAndSecondLargest(array);
    }
}
