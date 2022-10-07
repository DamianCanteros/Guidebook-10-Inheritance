/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos. 
 */
package exercise_2;


import exercise_2.object.TV;
import exercise_2.object.WashingMachine;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) {

        WashingMachine wm1 = new WashingMachine();
        wm1.createWashingMachine();
        wm1.finalPrice();
        System.out.println(wm1.toString());
        
        TV tv1 = new TV();
        tv1.createTV();
        tv1.finalPrice();
        System.out.println(tv1.toString());
    }
    
}
