/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package exercise_1;

import exercise_1.object.Animal;
import exercise_1.object.Cat;
import exercise_1.object.Dog;
import exercise_1.object.Horse;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) {

        Animal dog1 = new Dog("Stich", "Carnivorous",15,"Doberman");
        dog1.feed();
        
        Animal dog2 = new Dog("Teddy","Croquettes",10,"chihuahua");
        dog2.feed();
        
        Animal cat1 = new Cat("Pelusa","Cookies",15,"Siamés");
        
        Animal horse1 = new Horse("Spark","Grass",25,"Fino");
        horse1.feed();
    }
}
