
package exercise_extra_3.object;

/**
 *
 * @author Damian
 */
public class FiveStars extends FourStars {

    protected int meetingRooms;
    protected int suites;
    protected int limos;
    
    public FiveStars(int meetingRooms, int suites, int limos, String gym, String restaurantName, int restaurantCapacity, int rooms, int beds, int flats, double priceOfRooms, String name, String address, String location, String manager) {
        super(gym, restaurantName, restaurantCapacity, rooms, beds, flats, priceOfRooms, name, address, location, manager);
        this.meetingRooms = meetingRooms;
        this.suites = suites;
        this.limos = limos;
        this.priceOfRooms+= valueAdded() + (15*limos);
    }

    @Override
    public String toString() {
        return "\n\t\tHotel\n=============  " + name + "  =============\n\t\t* * * * *" + 
        "\nRooms: " + rooms + " - Beds: " + beds + " - Flats: " + flats + 
        "\nAddress: " + address + " - Location: " + location + " - Manager: " + manager +
        "\nGym: " + gym + "\n______Restaurant " + restaurantName + "______\n\nCapacity: " + restaurantCapacity + 
        "\nMeeting Rooms: " + meetingRooms + " - Suites: " + suites + " - Limos: " + limos +        
        "\n\nPRICE OF ROOMS: $" + priceOfRooms + "\n";
    }
    
}
