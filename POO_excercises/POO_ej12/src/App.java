import Entities.*;
import Services.*;

public class App {
    public static void main(String[] args) throws Exception {
        Persona estaPersona = new Persona();
        Persona_Service service = new Persona_Service();

        estaPersona = service.crearPersona();

        service.calcularEdad(estaPersona);
        System.out.println(" es menor de 50 años? "+service.menorQue(estaPersona.getAge(), 50));
        service.mostrarPersona(estaPersona);
    }
}
