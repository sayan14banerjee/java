import java.util.Scanner;
import java.lang.Math;


class amstrong{
    public static int num_digit(int n){
        int s = 0;
        while(n>0){
            n = n/10;
            s++;
        }
        
        return s;
        
    }

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        int m = n;
        int temp = 0;
        int p = num_digit(n);
        while(n>0){
            int r = n%10;
            n = n/10;
            temp += Math.pow(r, p);
        }
        scanner.close();

        if (temp == m){
            System.out.println("The number is amstrong.");
        }
        else{
            System.err.println("The number is not prime.");
        }
        

    }

}