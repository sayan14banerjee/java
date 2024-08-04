import java.util.Scanner;

public class Reverse {
    
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int digit = scanner.nextInt();
        if (digit > 0){
        int r;
        int reverse = 0;
        while(digit > 0){
            r = digit % 10;
            digit /= 10;
            reverse  = reverse * 10 + r;

        }
        System.out.println(reverse);
    }
    else{
        System.out.println("Enter positive number");
}

}
}

