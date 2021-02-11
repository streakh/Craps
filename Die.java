
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        roll = this.roll();
    }

    public int roll()
    {
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
     
    public int getResult()
    {
        return roll;
    }
}
