
package exercise_1.object;

/**
 *
 * @author Damian
 */
public class Dog extends Animal {
    
    public Dog(String name, String food, int age, String breed) {
        super(name,food,age,breed);
    }

    @Override
    public void feed() {
        System.out.println("Hi, i am "+name+" a dog, i eat "+food);
    }
}
