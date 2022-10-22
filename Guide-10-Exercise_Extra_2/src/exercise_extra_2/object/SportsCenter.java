
package exercise_extra_2.object;

/**
 *
 * @author Damian
 */
public class SportsCenter extends Building {

    protected String name; 
    protected Boolean roofing; 

    public SportsCenter() {
    }

    public SportsCenter(String name, Boolean roofing, Double width, Double height, Double length) {
        super(width, height, length);
        this.name = name;
        this.roofing = roofing;
    }   

    public Boolean getRoofing() {
        return roofing;
    }

    @Override
    public double calculateSurface() {
        
        return width*length;
    }
    
    @Override
    public double calculateVolume() {

        return width*height*length;
    }    

    @Override
    public String toString() {
        return "=============SportsCenter=============\nName=" + name + "\nRoofing=" + roofing;
    }
    
}
