
package exercise_extra_2.object;

/**
 *
 * @author Damian
 */
public class OfficeBuilding extends Building {
    
    protected Integer offices;
    protected Integer peoplePerOffice;
    protected Integer floors;

    public OfficeBuilding() {
    }

    public OfficeBuilding(Integer offices, Integer peoplePerOffice, Integer floors, Double width, Double height, Double length) {
        super(width, height, length);
        this.offices = offices;
        this.peoplePerOffice = peoplePerOffice;
        this.floors = floors;
    }

    public void numberOfPeople() {
        
        System.out.println("\n_____________Number of People_____________\n");
        System.out.println("number of people per floor: " + offices*peoplePerOffice);
        System.out.println("number of people in the entire building: " + offices*peoplePerOffice*floors);
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
        return "=============OfficeBuilding=============\nOffices: " + offices + "\nPeople per office: " + peoplePerOffice + "\nFloors: " + floors;
    }
    
}