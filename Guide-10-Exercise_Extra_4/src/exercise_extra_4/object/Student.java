
package exercise_extra_4.object;

/**
 *
 * @author Damian
 */
public class Student extends Person {

protected String course;

    public Student(String course, String name, String surname, String ID, String maritalStatus) {
        super(name, surname, ID, maritalStatus);
        this.course = course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "\n\n_____________ " + name + " " + surname + " Student _____________\n\n" +
               "\nID:" + ID + " - Status: " + maritalStatus + 
               "\nCourse: " + course;
    }    
}
