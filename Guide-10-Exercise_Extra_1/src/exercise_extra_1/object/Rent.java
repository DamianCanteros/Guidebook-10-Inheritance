
package exercise_extra_1.object;

import java.util.Date;

/**
 *
 * @author Damian
 */
public class Rent {
        
    private String name;
    private int costumerID;
    private Date rentalDate = new Date();
    private Date returnDate;
    private int moorringPosition = (int)(Math.random()*100);
    private Boat boat;

    public Rent() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }
  
//Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//multiplicando por 10 los metros de eslora).
    public double rentCalculation() {
        
        return (returnDate.getDate() - rentalDate.getDate())*this.boat.moduleCalculation();
    }

    @Override
    public String toString() {
                return "_____________CUSTOMER_____________" + "\nName: " + name + "\ncostumerID: " + costumerID + "\nRental Date: " + rentalDate
                        + "\nReturn Date: " + returnDate + "\nMoorring Position: " + moorringPosition + "\n" + boat;
    } 
}
