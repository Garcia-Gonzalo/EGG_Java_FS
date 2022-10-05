import Entities.*;
import Services.*;
import java.util.Scanner;

public class App {

    private static int menu() {
        Scanner read = new Scanner(System.in);
        int opcion=0;
        do{            
            System.out.println("Menu Fracciones");
            System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n0.Salir");
            opcion = read.nextInt();
        } while (opcion<0 && opcion >4);
        return opcion;
    }

    public static void main(String[] args) throws Exception {
        boolean exit=false;
        int opt;
        Fraccion f1,f2;
        System.out.println("Ingresar fracciones");
        f1 = new Fraccion();
        f2 = new Fraccion();
        System.out.println(f1+", "+f2);
    

        do{
            opt = menu();
            switch (opt){
                case 1: 
                    System.out.println("Suma= "+ FraccionService.suma(f1, f2));
                    break;
                case 2:
                    System.out.println("Resta= "+FraccionService.resta(f1, f2));
                    break;
                case 3:
                    System.out.println("Multiplicacion= "+FraccionService.multiplica(f1, f2));
                    break;
                case 4:
                    System.out.println("Division= "+FraccionService.divide(f1, f2));
                case 0:
                    exit = true;
            }
        } while (!exit);

    }
}
