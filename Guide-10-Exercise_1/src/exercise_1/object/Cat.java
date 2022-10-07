
package exercise_1.object;

/**
 *
 * @author Damian
 */
public class Cat extends Animal {
    
    public Cat(String name, String food, int age, String breed) {
        super(name,food,age,breed);
    }

    @Override
    public void feed() {
        System.out.println("Hi, i am "+name+" a cat, i eat "+food);
    }
    
}
