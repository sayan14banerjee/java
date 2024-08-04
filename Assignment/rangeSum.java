import java.util.Scanner;

public class rangeSum {
    
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Start number: ");
        int lower = scanner.nextInt();

        System.out.print("Enter stop number: ");
        int upper = scanner.nextInt();
        int sum = 0;
        for (int i = lower; i <= upper; i++){
            sum+= i;
        }
        System.out.println("Sum " + sum);
    }

}
