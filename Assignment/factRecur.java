import java.util.*;
public class factRecur {
    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
    
}
