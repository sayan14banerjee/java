import java.util.Scanner;

public class ExtractDigit {
    
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int digit = scanner.nextInt();

        int r;
        while(digit > 0){
            r = digit % 10;
            digit /= 10;
            System.out.print(r+ " ");

        }
        System.out.println("Done");
    }

}

