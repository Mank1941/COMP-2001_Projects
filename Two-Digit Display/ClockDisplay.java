
/**
 * Write a description of class ClockDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;

    /**
     * Name of the Clock
     */
    public ClockDisplay()
    {
        // initialise instance variables
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
    }

    private void updateDisplay(){
       displayString = hours.getDisplayValue() + ":" +
       minutes.getDisplayValue();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void timeTick(){
        minutes.increment();
        if(minutes.getValue() == 0){
           // it just rolled over
           hours.increment();
        }
        updateDisplay();
    }
}
