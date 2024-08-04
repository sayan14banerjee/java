import java.util.Scanner;

public class Fibbonacci {
    
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum+= a;
            a = b;
            b = sum;
            System.out.println( sum);
        }
        
    }

}

