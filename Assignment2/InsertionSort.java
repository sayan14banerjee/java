import java.util.Arrays;

public class InsertionSort {

    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Traverse through 1 to n-1 elements
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Element to be compared

            int j = i - 1;
            // Move elements of arr[0..i-1], that are greater than key, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;  // Insert key into its correct position
        }
    }

    // Main method to test insertion sort
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        
        insertionSort(arr);
        
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
