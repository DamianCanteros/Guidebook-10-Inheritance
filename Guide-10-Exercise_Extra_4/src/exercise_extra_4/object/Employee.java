
package exercise_extra_4.object;

/**
 *
 * @author Damian
 */
public class Employee extends Person {

protected String incorporation; //year
protected String dispatch; //number   

    public Employee(String incorporation, String dispatch, String name, String surname, String ID, String maritalStatus) {
        super(name, surname, ID, maritalStatus);
        this.incorporation = incorporation;
        this.dispatch = dispatch;
    }

    public void setDispatch(String dispatch) {
        this.dispatch = dispatch;
    }
}
