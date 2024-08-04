import java.util.Scanner;

public class PatternC {
    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number of row: ");
            int n = scanner.nextInt();
            for (int i = n; i>=1; i--){
                for (int k = n-i; k>=1; k--){
                    System.out.print("  ");
                }
                for (int j=i; j>=1; j--){
                    System.out.print("# ");
                }
                
                System.out.println();
            }
        }
    }
}