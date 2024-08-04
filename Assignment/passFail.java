import java.util.Scanner;
public class passFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        if(marks >= 50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        System.out.println("Done");
    }
    
}
