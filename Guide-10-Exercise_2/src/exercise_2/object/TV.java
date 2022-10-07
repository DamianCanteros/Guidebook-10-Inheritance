/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_2.object;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class TV extends Appliance{
    
       protected double resolution;
       protected boolean DTTtuner ;

    public TV() {
    }

    public TV(double resolution, boolean DTTtuner, double price, String color, char consumption, double weight) {
        super(price, color, consumption, weight);
        this.resolution = resolution;
        this.DTTtuner = DTTtuner;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public boolean isDTTtuner() {
        return DTTtuner;
    }

    public void setDTTtuner(boolean DTTtuner) {
        this.DTTtuner = DTTtuner;
    }
       
// Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
    public void createTV(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("_____________TV_____________");
        createAppliance();
        System.out.println("enter the resolution of the TV");
        this.resolution = read.nextDouble();
        System.out.println("Does it have a DTT tuner? Y/N");
        String answer = read.next();
        this.DTTtuner = answer.equalsIgnoreCase("Y");
    }    
    
// Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.  
    @Override
    public void finalPrice() {
        super.finalPrice(); 
        if (this.resolution>40) {
            this.price=this.price*1.30;
        }   
        if (this.DTTtuner) {
            this.price=this.price+500;
        } 
    }  

    @Override
    public String toString() {
        return "_____________TV_____________"+"\n"+ 
               "resolution: " + resolution +"\n"+
               "DTTtuner: " + DTTtuner +"\n"+
               "price: " + price +"\n"+ 
               "color: " + color +"\n"+ 
               "consumption: " + consumption +"\n"+ 
               "weight: " + weight;
    }
}
