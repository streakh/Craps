
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Craps
{
    public static void main (String[] args)
    {
    Die d1 = new Die();
    Die d2 = new Die();
    
    int total = d1.roll() + d2.roll();
    
    if (total == 7 || total == 11)
    {
        //win
    }
    else if (total == 2 || total == 3 || total == 12)
    {
        //loss
    }
    
    }
}
