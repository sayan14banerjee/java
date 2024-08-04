import java.util.Scanner;

public class calculator {
public static int sum(int num1, int num2){
    return num1 + num2;
}
public static int sub(int num1, int num2){
    return num1 - num2;
}
public static int mul(int num1, int num2){
    return num1 * num2;
}
public static int div(int num1, int num2){
    return num1 / num2;
}
public static int mod(int num1, int num2){
    return num1 % num2;
}


public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter 1st number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter 2nd number: ");
    int num2 = scanner.nextInt();

    System.out.println("Chose operstor: \n+\n-\n*\n/\n%");
    String ch = scanner.next();

    switch (ch) {
        case "+":
            System.out.println(sum(num1, num2));
            break;
        
        case "-":
            System.out.println(sub(num1, num2));
            break;

        case "*":
            System.out.println(mul(num1, num2));
            break;

        case "/":
            System.out.println(div(num1, num2));;
            break;

        case "%":
            System.out.println(mod(num1, num2));
            break;
    
        default:
            System.out.println("Invalid Input");
            break;
    }

    scanner.close();
    }
}
