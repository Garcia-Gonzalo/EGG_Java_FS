package Entidades;

import java.util.Scanner;

public class Circunferencia{
    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner keyIn = new Scanner(System.in);
        System.out.print("Ingrese el radio:  ");
        this.radio = keyIn.nextDouble();    
    }
   
   public void area() {
    this.area = Math.PI * Math.sqrt(radio);
   }
   //MΓ©todo perimetro(): para calcular el perΓ­metro (πππ«π’π¦ππ­π«π¨ = π β π β π«πππ’π¨).
   public void perimetro() {
    this.perimetro = Math.PI * 2 * radio;
    
   }

   public void showCircle() {
    System.out.println("radio =  "+radio);
    System.out.println("area =  "+area);
    System.out.println("perimetro =  "+perimetro);
    
   }

}