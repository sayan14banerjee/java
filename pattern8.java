import java.util.Scanner;

public class pattern8 {
     public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number of row: ");
            int n = scanner.nextInt();
            for (int i = n; i>=1; i--){
                for (int j=i*2; j>=1; j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
