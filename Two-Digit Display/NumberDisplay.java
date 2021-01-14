
/**
 * Write a description of class NumberDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int limit;
    private int value;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int limit)
    {
        // initialise instance variables
        this.limit = limit;
        value = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getDisplayValue()
    {
        // put your code here
        if(value <10){
            return "0" + value;
        }
        else{
            return "" + value;
        } 
    }

    public void increment(){
        value = (value + 1) % limit;
    }
    
    public Integer getValue(){
        return value;
    }
    
}
