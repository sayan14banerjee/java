import java.util.*;

class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in decimal");
        int num = sc.nextInt();

        String hexString = Integer.toHexString(num);
        
        // Print the result
        System.out.println("Decimal: " + num);
        System.out.println("Hexadecimal: " + hexString.toUpperCase()); 

    }
}