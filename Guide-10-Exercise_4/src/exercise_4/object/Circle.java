/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_4.object;

/**
 *
 * @author Damian
 */
public class Circle implements CalculationForms{
    
    private int radius = (int)(Math.random()*100);

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area(){

        return PI * Math.pow( this.radius,2); 
    }
    @Override
    public double perimeter(){

        return PI *  this.radius * 2; 
    }    
}
