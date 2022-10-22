
package exercise_4.object;

/**
 *
 * @author Damian
 */
public class Rectangle implements CalculationForms{
    
    private int hight = (int)(Math.random()*100);
    private int width = (int)(Math.random()*100);

    public Rectangle() {
    }

    public Rectangle(int hight, int width) {
        this.hight = hight;
        this.width = width;
    }

    @Override
    public double area(){

        return  this.hight *  this.width; 
    }
    @Override
    public double perimeter(){

        return ( this.hight +  this.width) * 2; 
    }
}
