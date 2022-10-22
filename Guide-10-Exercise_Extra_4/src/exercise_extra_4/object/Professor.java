
package exercise_extra_4.object;

/**
 *
 * @author Damian
 */
public class Professor extends Employee {

protected String department;

    public Professor(String department, String incorporation, String dispatch, String name, String surname, String ID, String maritalStatus) {
        super(incorporation, dispatch, name, surname, ID, maritalStatus);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "\n\n_____________ " + name + " " + surname + " Professor _____________\n\n" +
               "\nID:" + ID + " - Status: " + maritalStatus +      
               "\nIncorporation: " + incorporation + " - Dispatch: " + dispatch + 
               "\nDepartment: " + department;
    }
}
