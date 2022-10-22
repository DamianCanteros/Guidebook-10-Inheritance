
package exercise_extra_1.object;

import java.util.Date;

/**
 *
 * @author Damian
 */
public class Yacht extends MotorBoat{
    
    protected int cabin;

    public Yacht() {
    }

    public Yacht(int cabin, int power, String tuition, double length, Date yearProduction) {
        super(power, tuition, length, yearProduction);
        this.cabin = cabin;
    }

    @Override
    public double moduleCalculation() {
                
        return getLength()*10+power+cabin;
    } 

    @Override
    public String toString() {
        return "_____________YACHT_____________" + "\nTuition: " + tuition + "\nLength: " + length+"mts" + "\nYear Production: " + yearProduction + "\nPower: " + power + "\nCabin: " + cabin;
    }
    
}
