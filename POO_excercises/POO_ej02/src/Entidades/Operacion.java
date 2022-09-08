package Entidades;

import java.util.Scanner;

public class Operacion {

    double num1, num2;

    public Operacion() {
    }
    public Operacion(double num1, double num2) {

        this.num1 = num1;
        this.num2 = num2;
    }
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion() {
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Ingrese los dos numeros");        
        this.num1 = keyIn.nextDouble();
        this.num2 = keyIn.nextDouble();
    }

    public double sumar() {
        return num1 + num2;
    }
    public double restar() {
        return num1 - num2;
    }
    public double multiplicar() {
        if (num1!=0 && num2!=0) return num1 * num2;
        else{
            System.out.println("Error, unos de los numeros es 0");
            return 0;
        }       
    }
    public double dividir() {
        if (num2!=0) return num1 / num2;
        else {
            System.out.println("Error, no se puede dividir por 0");
            return 0;
        }
        
    }





    
    
}
