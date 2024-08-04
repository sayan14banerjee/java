import java.util.Scanner;

public class pattern10 {
     public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number of row: ");
            int n = scanner.nextInt();
            for (int i = 1; i<=n; i++){
                for (int k=1; k <=2*(n-i); k++){
                    System.out.print(" ");
                }
                for (int j=1; j<=(2*i-1); j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
