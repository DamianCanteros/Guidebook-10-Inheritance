
package exercise_2.object;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class WashingMachine extends Appliance {
    
    protected double burden;

    public WashingMachine() {
    }

    public WashingMachine(double burden, double price, String color, char consumption, double weight) {
        super(price, color, consumption, weight);
        this.burden = burden;
    }

    public WashingMachine(double burden) {
        this.burden = burden;
    }

    public double getBurden() {
        return burden;
    }

    public void setBurden(double burden) {
        this.burden = burden;
    }

// Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
    public void createWashingMachine(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("_____________WASHING MACHINE_____________");
        createAppliance();
        System.out.println("enter the burden of the Washing Machine");
        this.burden = read.nextDouble();

    }
// Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.

    @Override
    public void finalPrice() {
        super.finalPrice(); 
        if (this.burden>30) {
            this.price=this.price+500;
        }  
    }
    
    @Override
    public String toString() {
        return "_____________WASHING MACHINE_____________"+"\n"+ 
               "burden: " + burden +"\n"+
               "price: " + price +"\n"+ 
               "color: " + color +"\n"+ 
               "consumption: " + consumption +"\n"+ 
               "weight: " + weight;
    }
}
