import java.util.Scanner;

public class rangePrime {
    public static boolean isprime(int n){
        int i;
        if (n == 1 || n == 0){
            return false;
        }
        for (i = 2; i < n; i ++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper limit: ");
        int upper = scanner.nextInt();
        System.out.println("Prime numbers between " + lower + " and " + upper + " are: ");
        for (int i = lower; i <= upper; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
    }

}
}
