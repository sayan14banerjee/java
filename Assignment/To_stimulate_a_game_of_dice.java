//Write about the program
import java.util.*;
class To_stimulate_a_game_of_dice
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random di=new Random();
        int dice;
        String choise;
        boolean con =true;
        while(con)
        {
            dice=di.nextInt(6)+1;
                System.out.println("The number is "+dice);

            System.out.println("To continue enter yes and to break enter anything ");
           choise=sc.next();

           if (choise.equalsIgnoreCase("yes"))
            {
            con = true;
        } else {
            con = false;
        }
            
        }
    }
}