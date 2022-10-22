
package exercise_extra_4.object;

/**
 *
 * @author Damian
 */
public class Person {
      
protected String name; 
protected String surname;
protected String ID;
protected String maritalStatus;

    public Person(String name, String surname, String ID, String maritalStatus) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.maritalStatus = maritalStatus;
    }

    public String getID() {
        return ID;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

}
