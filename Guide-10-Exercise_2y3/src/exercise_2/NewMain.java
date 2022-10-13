/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos. 
 *//*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
*/
package exercise_2;


import exercise_2.object.Appliance;
import exercise_2.object.TV;
import exercise_2.object.WashingMachine;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class NewMain {
    
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ArrayList<Appliance> Appliances = new ArrayList();
  
        String answer = "Y";
        
        do {
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("1.Create a Washing Machine");
            System.out.println("2.Create a TV");
            int answerInt = read.nextInt();
            System.out.println("");

            switch (answerInt){

                case 1: 
                    WashingMachine wm1 = new WashingMachine();
                    wm1.createWashingMachine();
                    Appliances.add(wm1);
                break;
                case 2:
                    TV tv1 = new TV();
                    tv1.createTV();
                    Appliances.add(tv1);
                break;
            } 
            System.out.println("Do you want enter another Appliance? Y/N");
            answer = read.next();

        } while (answer.equalsIgnoreCase("Y"));
        
        double fp=0;
        for (Appliance aux : Appliances) {
            
            aux.finalPrice();
            System.out.println(aux.toString());
            fp+= aux.getPrice();
        }
        System.out.println("");
        System.out.println("Total Price $"+fp);
    } 
}
