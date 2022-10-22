/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package exercise_4;

import exercise_4.object.Circle;
import exercise_4.object.Rectangle;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        
        System.out.println("Circle Area: " + c1.area());
        System.out.println("Circle Perimeter: " + c1.perimeter());
        
        System.out.println("__________________________");  
        System.out.println("");  
        
        System.out.println("Rectangle Area: " + r1.area());
        System.out.println("Rectangle Perimeter: " + r1.perimeter());
    }
}
