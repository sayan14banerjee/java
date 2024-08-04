import java.util.Scanner;

class odd_even {
    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            int num;
            System.out.println("Enter the number: ");
            num = scanner.nextInt();

            if (num % 2 == 0){
                System.out.println("Ther number s even");
            }
            else{
                System.out.println("The number is odd");
                }
        }

    }
}
