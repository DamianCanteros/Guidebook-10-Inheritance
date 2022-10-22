
package exercise_extra_3.object;

/**
 *
 * @author Damian
 */
public class Hotel extends Lodgement {
    
    protected int rooms;
    protected int beds;
    protected int flats;
    protected double priceOfRooms;

    public Hotel(int rooms, int beds, int flats, double priceOfRooms, String name, String address, String location, String manager) {
        super(name, address, location, manager);
        this.rooms = rooms;
        this.beds = beds;
        this.flats = flats;
        this.priceOfRooms = 50 + beds;
    }

    public double getPriceOfRooms() {
        return priceOfRooms;
    }

}
