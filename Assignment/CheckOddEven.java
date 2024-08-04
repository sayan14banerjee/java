import java.util.*;

class CheckOddEven {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        if (num %2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

        System.out.println("Bye");

    }
}
