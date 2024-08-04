import java.util.*;

public class multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (number % 5 == 0 && number % 7 == 0) {
            System.out.println("Number is multiple of 5 and 7");
        } else {
            System.out.println("Number is not multiple of 5 and 7");
        }
    }
    
}
