import java.util.Scanner;

public class harmonicSum {
    
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++){
            sum+= 1.0/i;
        }
        System.out.println("Sum " + sum);
    }

}

