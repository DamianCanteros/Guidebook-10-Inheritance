/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_extra_3.object;

/**
 *
 * @author Damian
 */
public class Residence extends NonHotel {
    
    protected int rooms;
    protected boolean discounts;
    protected boolean sportsField;

    public Residence(int rooms, boolean discounts, boolean sportsField, boolean privat, double metersSquares, String name, String address, String location, String manager) {
        super(privat, metersSquares, name, address, location, manager);
        this.rooms = rooms;
        this.discounts = discounts;
        this.sportsField = sportsField;
    }  

    public boolean isDiscounts() {
        return discounts;
    }

    @Override
    public String toString() {
        return "\n============= Residence " + name + " =============\n" + 
        "\nRooms: " + rooms + " - Discounts: " + discounts + " - Sports Field: " + sportsField +
        "\nPrivat: " + privat + " - Meters Squares: " + metersSquares +        
        "\nAddress: " + address + " - Location: " + location + " - Manager: " + manager + "\n";
    }
    
}
