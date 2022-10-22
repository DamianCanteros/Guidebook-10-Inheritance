
package exercise_extra_1.object;

import java.util.Date;

/**
 *
 * @author Damian
 */
public abstract class Boat {
                
    protected String tuition;
    protected double length;
    protected Date yearProduction;

    public Boat() {
    }

    public Boat(String tuition, double length, Date yearProduction) {
        this.tuition = tuition;
        this.length = length;
        this.yearProduction = yearProduction;
    }

    public double getLength() {
        return length;
    }

//En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
//sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
//en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
//el número de camarotes.        
    public abstract double moduleCalculation() ;
}
