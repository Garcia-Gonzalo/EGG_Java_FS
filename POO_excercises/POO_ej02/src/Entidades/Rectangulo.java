/*
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidades;
import java.util.Scanner;

public class Rectangulo {

    private double altura, base, area, perimetro;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

   public void crearRectangulo() {
    Scanner keyIn = new Scanner(System.in);
    System.out.print("Ingrese la altura: ");
    this.altura = keyIn.nextDouble();
    System.out.println("");
    System.out.print("Ingrese la base: ");
    this.base = keyIn.nextDouble();
    System.out.println("Rectangulo creado..");
    }

    public void calcularSuperficie() {
        this.area = this.base * this.altura;
    }
    public void calcularPerimetro() {
        this.perimetro = 2 * (this.base + this.altura);
    }
    public void dibujar() {
        int i, j;
        char imprime;

        for (i=1; i<= this.altura; i++){
            System.out.print("*");
            for (j=2; j< this.base; j++){
                if (i==1 || i== this.altura) imprime = '*';
                else imprime = ' ';
                System.out.print(imprime);
            }
            System.out.print("*");
            System.out.println("");
        }
    }

    public void show() {
        System.out.println("Datos del recatangulo:");
        System.out.println("Base= "+this.base+"   |  altura= "+this.altura);
        System.out.println("Perimetro= "+this.perimetro+"  |  Area= "+this.area);
        
    }

    
}
