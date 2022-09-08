package Services;

import Entities.Persona;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Persona_Service {
    
    public Persona crearPersona() {
        Persona thisPerson = new Persona();
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        thisPerson.setNombre(read.nextLine());
        thisPerson.setFechaNac(CheckDateInput_Service.createFecha());

        return thisPerson;        
    }

    public void calcularEdad(Persona person) {
        person.setAge(Period.between(person.getFechaNac(),LocalDate.now()).getYears());
        System.out.println(person.getAge()+" años");
    }

    public boolean menorQue(int age1, int age2) {
        return age1 < age2;
        
    }
    
    public void mostrarPersona(Persona person) {
        System.out.println(person);
        
    }
}
