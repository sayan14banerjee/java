import java.util.*;
public class prime {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if (isprime(number)){
            System.out.println(number + " is prime");
        }
        else{
            System.out.println(number + " is not prime");
        }


    
}
}