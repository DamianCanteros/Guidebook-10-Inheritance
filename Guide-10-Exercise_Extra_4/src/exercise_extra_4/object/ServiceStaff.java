
package exercise_extra_4.object;

/**
 *
 * @author Damian
 */
public class ServiceStaff extends Employee {

protected String section;

    public ServiceStaff(String section, String incorporation, String dispatch, String name, String surname, String ID, String maritalStatus) {
        super(incorporation, dispatch, name, surname, ID, maritalStatus);
        this.section = section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "\n\n_____________ " + name + " " + surname + " ServiceStaff _____________\n\n" +
               "\nID:" + ID + " - Status: " + maritalStatus +      
               "\nIncorporation: " + incorporation + " - Dispatch: " + dispatch + 
               "\nSection: " + section;
    }
}
