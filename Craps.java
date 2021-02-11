/**
 * Write a description of class Craps here.
 *
 * @author Streak Honey
 * @version 2-11-2021
 */
import java.util.Scanner;
public class Craps
{
    public static void main (String[] args)
    {
        //pause before roll
        Scanner in = new Scanner(System.in);
        System.out.println ("Press <Enter> to roll the dice.");
        String entered = in.nextLine();
        
        //roll dice
        Die d1 = new Die();
        Die d2 = new Die();
        int total = d1.roll() + d2.roll();
        
        System.out.println ("You rolled a " + d1.getResult() + " and a " + d2.getResult());
        System.out.println ("Your total is " + total);
        if (total == 7 || total == 11)
        {
            System.out.println ("You won!");
        }
        else if (total == 2 || total == 3 || total == 12)
        {
            //loss
            System.out.println ("You lost. :(");
        }
         
        else //neither yet
        {
            int point = total;
            total = d1.roll() + d2.roll();
            while (total != 7 && total != point)
            {
                //neither yet
                total = d1.roll() + d2.roll();
            }
            // Give the right message
            if (total == point)
            {
                // won
                System.out.println ("You won!");
            }
            else
            {
                // lost
                System.out.println ("You lost. :(");
            }
        }
    }
}
