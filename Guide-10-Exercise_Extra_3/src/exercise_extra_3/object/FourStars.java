
package exercise_extra_3.object;

/**
 *
 * @author Damian
 */
public class FourStars extends Hotel {
    
    protected String gym; //tipo “A” o de tipo “B”
    protected String restaurantName;
    protected int restaurantCapacity;

    public FourStars(String gym, String restaurantName, int restaurantCapacity, int rooms, int beds, int flats, double priceOfRooms, String name, String address, String location, String manager) {
        super(rooms, beds, flats, priceOfRooms, name, address, location, manager);
        this.gym = gym;
        this.restaurantName = restaurantName;
        this.restaurantCapacity = restaurantCapacity;
        this.priceOfRooms+= valueAdded();
    }
    
    public int valueAdded(){
        
        int aux=10;
        if (restaurantCapacity>50) {
   
            aux = 50;
        }else if (restaurantCapacity>30) {

            aux = 30;
        }
        if (gym.equalsIgnoreCase("A")) {

            aux += 50;
        }else {

            aux += 30;
        }
        return aux;
    }

    @Override
    public String toString() {       
        return "\n\t\tHotel\n=============  " + name + "  =============\n\t\t* * * *" + 
        "\nRooms: " + rooms + " - Beds: " + beds + " - Flats: " + flats + 
        "\nAddress: " + address + " - Location: " + location + " - Manager: " + manager +
        "\nGym: " + gym + "\n______Restaurant " + restaurantName + "______\n\nCapacity: " + restaurantCapacity +    
        "\n\nPRICE OF ROOMS: $" + priceOfRooms + "\n" ;
        
    }
   
}
