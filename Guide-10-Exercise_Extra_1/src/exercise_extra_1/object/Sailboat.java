
package exercise_extra_1.object;

import java.util.Date;

/**
 *
 * @author Damian
 */
public class Sailboat extends Boat{
    
    protected int mast;

    public Sailboat() {
    }

    public Sailboat(int mast, String tuition, double length, Date yearProduction) {
        super(tuition, length, yearProduction);
        this.mast = mast;
    }
        
    @Override
    public double moduleCalculation() {
        
        return getLength()*10+mast;
    } 

    @Override
    public String toString() {
        return "_____________SAILBOAT_____________" + "\nTuition: " + tuition + "\nLength: " + length+"mts" + "\nYear Production: " + yearProduction + "\nMast: " + mast;
    }
}
