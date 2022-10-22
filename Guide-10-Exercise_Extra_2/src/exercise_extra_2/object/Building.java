
package exercise_extra_2.object;

/**
 *
 * @author Damian
 */
public abstract class Building {

    protected Double width;
    protected Double height;
    protected Double length;

    public Building() {
    }

    public Building(Double width, Double height, Double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public abstract double calculateSurface() ;
    public abstract double calculateVolume() ;    
}
