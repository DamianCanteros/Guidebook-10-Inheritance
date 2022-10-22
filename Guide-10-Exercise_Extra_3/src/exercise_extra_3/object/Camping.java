
package exercise_extra_3.object;

/**
 *
 * @author Damian
 */
public class Camping extends NonHotel {
    
    protected int maxTents;
    protected int bathrooms;
    protected boolean restaurant;

    public Camping(int maxTents, int bathrooms, boolean restaurant, boolean privat, double metersSquares, String name, String address, String location, String manager) {
        super(privat, metersSquares, name, address, location, manager);
        this.maxTents = maxTents;
        this.bathrooms = bathrooms;
        this.restaurant = restaurant;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    @Override
    public String toString() {
        return "\n============= Camping " + name + " =============\n" + 
        "Max Capacity of Tents: " + maxTents + " - Bathrooms: " + bathrooms + " - Restaurant: " + restaurant +
        "\nPrivat: " + privat + " - Meters Squares: " + metersSquares +        
        "\nAddress: " + address + " - Location: " + location + " - Manager: " + manager + "\n";
    }
}
