import java.util.Scanner;

public class pattern5 {
    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number of row: ");
            int n = scanner.nextInt();
            for (int i = 1; i<=n; i++){
                for (int j=1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
