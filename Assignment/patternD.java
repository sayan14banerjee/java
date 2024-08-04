import java.util.Scanner;

public class patternD {
    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number of row: ");
            int n = scanner.nextInt();
            for (int i = 1; i<=n; i++){
                for (int k = n-i; k>=1; k--){
                    System.out.print("  ");
                }
                for (int j=0; j<i; j++){
                    System.out.print("# ");
                }
                System.out.println();
            }
        }
    }
}
