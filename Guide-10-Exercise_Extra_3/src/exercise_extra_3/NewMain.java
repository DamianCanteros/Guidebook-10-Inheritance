/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. 
 */
package exercise_extra_3;

import exercise_extra_3.object.Camping;
import exercise_extra_3.object.FiveStars;
import exercise_extra_3.object.FourStars;
import exercise_extra_3.object.Hotel;
import exercise_extra_3.object.Lodgement;
import exercise_extra_3.object.Residence;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ArrayList<Lodgement> lodgements = new ArrayList<>();
             
        FourStars h41 = new FourStars("A", "Pertutti", 50, 80, 150, 50, 15, "Olimpus", "Nueva Guinea", "Molcajete", "Bruno Mazziero");
        lodgements.add(h41);
        FourStars h42 = new FourStars("B", "Olika", 50, 90, 210, 50, 15, "Tragoron", "Autralia", "Mosanbique", "Melvin sark");
        lodgements.add(h42);
        FourStars h43 = new FourStars("A", "Mingo", 50, 90, 210, 50, 15, "Tragoron", "Argentina", "Tuculandia", "Melvin sark");
        lodgements.add(h43);
        FiveStars h51 =new FiveStars(5, 8, 4, "B", "La Taberna", 35, 90, 95, 50, 8, "Continente", "Margarita", "Holanda", "Anonimo");
        lodgements.add(h51);
        FiveStars h52 =new FiveStars(5, 8, 4, "B", "Tienda De Cafe", 35, 90, 95, 50, 8, "Continente", "Margarita", "Holanda", "Anonimo");
        lodgements.add(h52);
        FiveStars h53 =new FiveStars(5, 8, 4, "A", "Los Cardales", 35, 90, 95, 50, 8, "Continente", "Margarita", "Holanda", "Anonimo");
        lodgements.add(h53);
        Camping c1 = new Camping(10, 5, true, true, 600, "Kaikawaka", "Laggon", "Lago Kaikawaka", "Robert de Niro");
        lodgements.add(c1);
        Camping c2 = new Camping(10, 5, false, false, 600, "Kaikawaka", "Laggon", "Lago Kaikawaka", "Robert de Niro");
        lodgements.add(c2);
        Residence r1 = new Residence(33, false, true, false,800, "Minera", "este", "Arizona", "Jenkis Low");
        lodgements.add(r1);
        Residence r2 = new Residence(33, true, true, true,800, "Loptic", "marle", "Washinton", "Marcus crown");
        lodgements.add(r2);
        
        
        int answer;
        
        do {
            System.out.println("\n============= LODGEMENT SYSTEM =============\n");
            System.out.println("What would you like to do?");
            System.out.println("\n1) All Lodgements\n2) All Hotels from most expensive to cheapest\n3) All Campsites with restaurant\n4) All the Residences that have a discount\n5) Exit");
            answer = read.nextInt();

            switch (answer){

                case 1:
                    System.out.println(lodgements);
                    break;
                case 2:

                    ArrayList <Hotel> hotels =  new ArrayList();

                    for (Lodgement aux : lodgements) {

                        if (aux instanceof Hotel) {

                            Hotel h = (Hotel) aux;
                            hotels.add(h);
                            }  
                        }  
                    Collections.sort(hotels, organizePrice);
                    System.out.println(hotels);
                    break;
                case 3:
                    for (Lodgement aux : lodgements) {

                        if (aux instanceof Camping) {

                            Camping c = (Camping) aux;

                            if (c.isRestaurant()) {
                                System.out.println(c);
                            }
                        }
                    }
                    break;
                case 4:
                    for (Lodgement aux : lodgements) {

                        if (aux instanceof Residence) {

                            Residence r = (Residence) aux;
                            if (r.isDiscounts()) {
                                System.out.println(r);
                            }
                        }
                    }
                    break;                    
            }
        } while (answer!=5);  
    }
    private static Comparator<Hotel> organizePrice = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel t, Hotel t1) {
            
        return Double.compare(t.getPriceOfRooms(), t1.getPriceOfRooms());
        }    
    };  
}
