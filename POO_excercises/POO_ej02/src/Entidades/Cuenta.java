package Entidades;
import java.util.Scanner;

public class Cuenta {
    private String nombre;
    private int nroCuenta, dni;
    private double saldo = 0;

    public Cuenta() {
    }

    public Cuenta(String nombre, int nroCuenta, int dni) {
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void crearCuenta() {
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Nombre: ");
        this.nombre = keyIn.nextLine();
        System.out.println("Ingrese el DNI:");
        this.dni = keyIn.nextInt();
        System.out.println("Ingrese nro de cuenta:");
        this.nroCuenta = keyIn.nextInt();
        System.out.println("Cuenta creada..");
    }

    public void ingresarDinero() {
        Scanner keyIn = new Scanner(System.in);
        System.out.print("Ingrese el monto: ");
        this.saldo += keyIn.nextDouble();
        System.out.println("Dinero ingresado exitosamente");
    }
    public void retirarDinero() {
        double money;
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Saldo: "+saldo+" $");
        System.out.print("Cuanto desea retirar? ");
        money = keyIn.nextDouble();
        if (this.saldo - money > 0){
            this.saldo -= money;
            System.out.println("Extraccion exitosa");
        } else fondosInsuficientes();
    }

    private void fondosInsuficientes() {
        String answer;
        boolean ok = false;
        Scanner keyIn2 = new Scanner(System.in);

        
        do{
            System.out.println("No dispone de suficiente monto en su saldo, desea retirar el saldo completo?");
            answer = keyIn2.nextLine();
            answer = answer.toLowerCase();
        } while(!answer.equals("s") && !answer.equals("n"));

        if (answer.equals("s")){
            this.saldo = 0;
            System.out.println("Extraccion exitosa");
        }         
    }
    public void extraccionRapida() {
        Scanner keyIn3 = new Scanner(System.in);
        double money2;
        System.out.println("Saldo: "+saldo+" $");
        System.out.print("Retiro rapido(Max 20%).Cuanto desea retirar? ");
        money2 = keyIn3.nextDouble();
        if (money2 > (this.saldo *0.20)){
            System.out.println("No puede extraer mas del 20%");
        } else {
            saldo -= money2;
            System.out.println("Extraccion exitosa");
        }       
    }
    public void verSaldo() {
        System.out.println("Saldo: "+saldo+" $");        
    }       

    public void estadoCuenta() {
        System.out.println(this.nombre+" "+this.nroCuenta);
        System.out.println("Saldo: "+saldo+" $");        
    }
}

