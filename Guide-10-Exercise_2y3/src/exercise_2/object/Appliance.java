
package exercise_2.object;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class Appliance {
    
    protected double price;
    protected String color;
    protected char consumption;
    protected double weight;

// Un constructor vacío.
    public Appliance() {
    }
    
// Un constructor con todos los atributos pasados por parámetro.
    public Appliance(double price, String color, char consumption, double weight) {
        this.price = price;
        this.color = color;
        this.consumption = consumption;
        this.weight = weight;
    }   
    
//Métodos getters y setters de todos los atributos.
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumption() {
        return consumption;
    }

    public void setConsumption(char consumption) {
        this.consumption = consumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
// Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    public void testConsumption(char letter){
        
        if (letter=='A'|| letter=='B' || letter=='C' || letter=='D' || letter=='E' || letter=='F') {
            this.consumption=letter;
        }else {
            this.consumption='F';
        }
    }
     
// Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
    public void testColor(String color){
        
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            this.color=color;
        }else {
             this.color="blanco";
        }
    }

// Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    public void createAppliance(){
        
        Scanner read = new Scanner(System.in);
        System.out.println("enter the color of the Appliance");
        String color = read.next();
        System.out.println("enter the energy consumption of the Appliance");
        System.out.println("A,B,C,D,E or F");
        char letter = read.next().charAt(0);
        System.out.println("enter the weight of the Appliance");
        this.weight = read.nextDouble();
        this.price = 1000d;
        testConsumption(letter);
        testColor(color);
    }

// Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio.
    public void finalPrice(){
        switch (consumption){
            
            case 'A': this.price=this.price+1000;
            break;
            case 'B': this.price=this.price+800;
            break;
            case 'C': this.price=this.price+600;
            break;
            case 'D': this.price=this.price+500;
            break;
            case 'E': this.price=this.price+300;
            break;
            case 'F': this.price=this.price+100;
            break;
        }
        if (this.weight<19) {
            this.price=this.price+100;
        }else if (this.weight<49) {
            this.price=this.price+500;
        }else if (this.weight<79) {
            this.price=this.price+800;
        }else {
            this.price=this.price+1000;
        }        
    }
}
