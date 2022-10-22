/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package exercise_extra_2;

import exercise_extra_2.object.Building;
import exercise_extra_2.object.SportsCenter;
import exercise_extra_2.object.OfficeBuilding;
import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) {

        ArrayList<Building> Buildings = new ArrayList(); 

        SportsCenter sc1 = new SportsCenter("name1",true,40d,8d,80d);
        Buildings.add(sc1);
        SportsCenter sc2 = new SportsCenter("name2",false,20d,8d,40d);
        Buildings.add(sc2);
        OfficeBuilding ob1 = new OfficeBuilding(2,5,5,10d,20d,20d);
        Buildings.add(ob1);
        OfficeBuilding ob2 = new OfficeBuilding(4,6,20,20d,80d,40d);
        Buildings.add(ob2);
               
        int roofing = 0;
        int open = 0;
                
        for (Building aux : Buildings) {
            
            System.out.println("\n"+aux);
            System.out.println("Surface: " + aux.calculateSurface());
            System.out.println("Volume: " + aux.calculateVolume());  
            
            if (aux instanceof OfficeBuilding) {
                
                OfficeBuilding offices = (OfficeBuilding) aux;
                offices.numberOfPeople();
            }else {
                SportsCenter installation = (SportsCenter) aux;
                if (installation.getRoofing()) {
                    roofing++;
                }else{
                    open++;
                }
            }
        }
        System.out.println("\n_____________Type of Installation_____________\n");
        System.out.println("Roofed Sports Centers: " + roofing);
        System.out.println("Open Sports Centers: " + open);
    }
}
