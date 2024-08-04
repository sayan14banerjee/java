import java.util.Scanner;

public class HCFAndLCM {

    // Method to find the HCF using the Euclidean algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to find the LCM using the relationship between HCF and LCM
    public static int findLCM(int a, int b, int hcf) {
        return (a * b) / hcf;
    }

    // Main method to test the findHCF and findLCM methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2, hcf);

        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
