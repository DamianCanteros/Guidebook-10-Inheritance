
package exercise_extra_3.object;

/**
 *
 * @author Damian
 */
public class NonHotel extends Lodgement {
    
    protected boolean privat;
    protected double metersSquares;

    public NonHotel(boolean privat, double metersSquares, String name, String address, String location, String manager) {
        super(name, address, location, manager);
        this.privat = privat;
        this.metersSquares = metersSquares;
    }
      
}
