package Entidades;
import java.util.Scanner;

public class OperarCuenta {
    public static void creaCuenta(Cuenta laCuenta) {
        laCuenta.crearCuenta();
    }

    public static void operar(Cuenta laCuenta) {
        int opcion;
        opcion = menu();
        while(opcion!=6){
            switch (opcion){
                case 1:
                    laCuenta.ingresarDinero();
                    break;
                case 2:
                    laCuenta.retirarDinero();
                    break;
                case 3:
                    laCuenta.extraccionRapida();
                case 4:
                    laCuenta.verSaldo();
                case 5:
                    laCuenta.estadoCuenta();
            }
            opcion = menu();
        }
            
            
    }   
    
    private static int menu() {
        Scanner keyIn = new Scanner(System.in);
        int opcion;
        do {
        System.out.println("Bienvenido");
        System.out.println("1.Ingresar dinero\n2.Retirar dinero\n3.Retiro rapido\n4.Consultar saldo\n5.consultar datos\n6.Salir\n-------------------");
        opcion = keyIn.nextInt();
        } while (opcion <=0 || opcion >6);
        return opcion;
        
    }
}
