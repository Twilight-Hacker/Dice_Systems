
/**
 * Write a description of class Dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dice
{
    // instance variables - replace the example below with your own
    private int limit; //dice top number

    public Dice(int l)
    {
        limit=l;
    }
    
    public int getlimit(){
        return this.limit;
    }


    public int roll(){
    int d;
    
    d = (int)Math.floor(Math.random()*(limit-1) + 1);
    //System.out.println(d);
    
    return d;
    }
}
