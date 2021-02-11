/**
 * Takes in dice from the Die class to play a game of craps with the user
 *
 * @author Streak Honey
 * @version 2-11-2021
 */
import java.util.Scanner;
public class Craps
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println ("Do you want the rules to craps?(Y/N)");
        String instruct = in.nextLine();
        if (instruct.substring(0,1).equalsIgnoreCase("Y"))
        {
            System.out.println ("1. Roll two six-sided dice.");
            System.out.println ("2. a. On first roll, if you get a 7 or 11 you win!");
            System.out.println ("2. b. On first roll, if you get a 2, 3, or 12 you lose!");
            System.out.println ("2. c. Any other number you don't win or lose. The die roll becomes your 'point.");
            System.out.println ("3. Keep rolling the dice again until:");
            System.out.println ("4. a. You roll the point again and win!");
            System.out.println ("4. b. or you roll a 7 and lose.");
        }
        System.out.print("Would you like to play Craps (Y/N)?");
        String playGame = in.nextLine();
        
        while (playGame.equals("") || playGame.substring(0,1).equalsIgnoreCase("Y")) //start the game, default yes
        {
            //pause before roll
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
                System.out.println ("You didn't win or lose, you're still in it!");
                System.out.println ("Your point is " + total + ". Let's see if u can roll it before you roll a 7.");
                while (total != 7 && total != point)
                {
                    //neither
                    
                    System.out.println ("Press <Enter> to roll the dice.");
                    entered = in.nextLine();
                    System.out.println ("You rolled a " + d1.getResult() + " and a " + d2.getResult());
                    total = d1.roll() + d2.roll();
                    System.out.println ("Your total is " + total);
                }
                
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
            System.out.println ("Want to play again? (Y/N)");
            playGame = in.nextLine();
        }
        
        {
            System.out.println ("Sorry to hear. Come back another time!");
        }
    }
}
