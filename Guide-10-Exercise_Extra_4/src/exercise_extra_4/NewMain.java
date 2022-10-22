/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados. 
 */
package exercise_extra_4;

import exercise_extra_4.object.Employee;
import exercise_extra_4.object.Person;
import exercise_extra_4.object.Professor;
import exercise_extra_4.object.ServiceStaff;
import exercise_extra_4.object.Student;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class NewMain {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();
        
        Student s1 = new Student("course","name","surname","ID","maritalStatus");
        persons.add(s1);
        Student s2 = new Student("course","name","surname","ID","maritalStatus");
        persons.add(s2);
        Professor p1 = new Professor("department","incorporation","dispatch","name","surname","ID","maritalStatus");
        persons.add(p1);
        Professor p2 = new Professor("department","incorporation","dispatch","name","surname","ID","maritalStatus");
        persons.add(p2); 
        ServiceStaff ss1 = new ServiceStaff("section","incorporation","dispatch","name","surname","ID","maritalStatus");
        persons.add(ss1);
        ServiceStaff ss2 = new ServiceStaff("section","incorporation","dispatch","name","surname","ID","maritalStatus");
        persons.add(ss2);
        
        int answer;
        String id;
        
        do {
            System.out.println("\n============= FACULTY MANAGEMENT SYSTEM =============\n");
            System.out.println("What would you like to do?");
            System.out.println("\n1) Change of a person's marital status\n2) Reassignment of office to an employee\n3) Enrollment of a student in a new course"
                    + "\n4) Change of department of a teacher\n5) Section transfer of an employee of the service staff\n6) Print all the information of each type of individual\n7) Exit");
            answer = read.nextInt();

            switch (answer){

                case 1:
                    System.out.println("enter the ID of the person");
                    id = read.next();
                    for (Person aux : persons) {
                        if (id.equals(aux.getID())) {
                            System.out.println("enter the new marital status");
                            aux.setMaritalStatus(read.next());
                        }
                    }
                    break;
                case 2:
                    System.out.println("enter the ID of the employee");
                    id = read.next();
                    for (Person aux : persons) {
                        if (id.equals(aux.getID())) {
                            
                            if (aux instanceof Employee) {

                                Employee e = (Employee) aux;
                                System.out.println("enter the new office");
                                e.setDispatch(read.next());
                            }  
                        }
                    }
                    break;
                case 3:
                    System.out.println("enter the ID of the student");
                    id = read.next();
                    for (Person aux : persons) {
                        if (id.equals(aux.getID())) {
                            
                            if (aux instanceof Student) {

                                Student s = (Student) aux;
                                System.out.println("enter the new course");
                                s.setCourse(read.next());
                            }  
                        }
                    }
                    break;
                case 4:
                    System.out.println("enter the ID of the teacher");
                    id = read.next();
                    for (Person aux : persons) {
                        if (id.equals(aux.getID())) {
                            
                            if (aux instanceof Professor) {

                                Professor p = (Professor) aux;
                                System.out.println("enter the new department");
                                p.setDepartment(read.next());
                            }  
                        }
                    }
                    break;
                case 5:
                    System.out.println("enter the ID of the service staff");
                    id = read.next();
                    for (Person aux : persons) {
                        if (id.equals(aux.getID())) {
                            
                            if (aux instanceof ServiceStaff) {

                                ServiceStaff ss = (ServiceStaff) aux;
                                System.out.println("enter the new section");
                                ss.setSection(read.next());
                            }  
                        }
                    }
                    break; 
                case 6:
                        System.out.println(persons);
                    break;                     
            }
        } while (answer!=7);  
    }
}
