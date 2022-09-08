package Services;
import Entidades.nesspreso;
import java.util.Scanner;

public class serviceNesspreso {    

    public serviceNesspreso() {
    }
    private static int menuServir() {
        Scanner keyIn = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese el tamaño de la taza");
        System.out.println("1.Chico\n2.Mediano\n3.Grande");
        opcion = keyIn.nextInt();
        switch (opcion){
            case 1: return 125;
            case 2: return 190;
            case 3: return 250;
            default: return 125;
        }

        
    }
    private static int menuPrincipal() {
        int opcion;
        Scanner keyIn = new Scanner(System.in);

        do{
            System.out.println("Ingrese opciones");
            System.out.println("1.Cargar cafetera\n2.Servir taza\n3.Vaciar Cafetera\n4.Salir");
            opcion = keyIn.nextInt();
        } while(opcion<1 || opcion >6);
        return opcion;
    }

    public static void operarCafetera(nesspreso cafetera) {
        int opcion;
        Scanner keyIn = new Scanner(System.in);
        boolean exit = false;
        do{
            System.out.println("Quedan "+cafetera.getCapacidadActual()+" ml de cafe");
            System.out.println("--------------------------------------------");
            opcion= menuPrincipal();
            switch (opcion){
                case 1: cafetera.llenarCafetera();
                        break;
                case 2: cafetera.servirTaza(menuServir());
                        break;
                case 3: cafetera.vaciarCafetera();
                        break;
                default: exit = true;
            }

        } while (!exit);
    }
    
}
