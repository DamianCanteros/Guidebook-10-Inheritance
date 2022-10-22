/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package exercise_extra_1;


import exercise_extra_1.object.MotorBoat;
import exercise_extra_1.object.Rent;
import exercise_extra_1.object.Sailboat;
import exercise_extra_1.object.Yacht;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) throws ParseException {

        Rent r1 = new Rent();
        
        Scanner read = new Scanner(System.in);

        System.out.println("============ RENT SYSTEM ============");

        System.out.println("choose the type of boat");
        System.out.println("1. Sailboat");
        System.out.println("2. Motor Boat");
        System.out.println("3. Yacht");
        int answer = read.nextInt();

        System.out.println("enter the name of the costumer");
        r1.setName(read.next());

        System.out.println("enter the ID of the costumer");
        r1.setCostumerID(read.nextInt());

        System.out.println("enter the return date \ndd/MM/yyyy");
        String date = read.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        r1.setReturnDate(sdf.parse(date));
        
     
        System.out.println("enter the tuition of the Boat");
        String tuition = read.next();
        
        System.out.println("enter the length of the Boat");
        double length = read.nextDouble();
        
        System.out.println("enter the year production of the Boat \ndd/MM/yyyy");
        date = read.next();
        Date yearProduction = sdf.parse(date);

        double aux = 0;
        switch (answer){

            case 1:
                System.out.println("enter the number of mast of the Boat");
                int mast = read.nextInt();    
                Sailboat b1 = new Sailboat(mast,tuition,length,yearProduction);
                r1.setBoat(b1);
                aux = b1.moduleCalculation();
                break;
            case 2:
                System.out.println("enter the power of the Boat");
                int power = read.nextInt();    
                MotorBoat b2 = new MotorBoat(power,tuition,length,yearProduction);
                r1.setBoat(b2);
                aux = b2.moduleCalculation();
                break;
            case 3:
                System.out.println("enter the power of the Boat");
                power = read.nextInt();    
                System.out.println("enter the number of cabin of the Boat");
                int cabin = read.nextInt();   
                Yacht b3 = new Yacht(cabin,power,tuition,length,yearProduction);
                r1.setBoat(b3);
                aux = b3.moduleCalculation();
                break;
        }

        System.out.println(r1);       
        System.out.println("the rental price is: $" + aux);
    }    
} 
