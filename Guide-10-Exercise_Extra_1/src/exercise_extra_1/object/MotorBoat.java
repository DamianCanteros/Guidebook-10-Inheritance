
package exercise_extra_1.object;

import java.util.Date;

/**
 *
 * @author Damian
 */
public class MotorBoat extends Boat{
    
    protected int power;

    public MotorBoat() {
    }
    
    public MotorBoat(int power, String tuition, double length, Date yearProduction) {
        super(tuition, length, yearProduction);
        this.power = power;
    }
    
    @Override
    public double moduleCalculation() {

        return getLength()*10+power;
    } 

    @Override
    public String toString() {
        return "_____________MOTOR BOAT_____________" + "\nTuition: " + tuition + "\nLength: " + length+"mts" + "\nYear Production: " + yearProduction + "\nPower: " + power;
    }
}
