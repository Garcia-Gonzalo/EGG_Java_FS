package Entities;
import java.util.Scanner;

public class Raices {

    private double a, b, c, discr;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discr = calculateDiscriminant();

    }

    public Raices() {
        inputNumbers();
    }


    private void inputNumbers() {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese a, b y c:");
        this.a = read.nextDouble();
        this.b = read.nextDouble();
        this.c = read.nextDouble();
        this.discr = calculateDiscriminant();
                
    }

    private double calculateDiscriminant(){
        return (Math.pow(this.b, 2) -4 * this.a *this.c);
        
    }

    public void calculateRoots() {
        System.out.println("Discriminante: "+this.discr);
        if (this.discr == 0){
            System.out.println("Tiene una raiz:: "+((this.b/(2*this.a))*-1));
        } else if (this.discr > 0){
            System.out.print("Tiene dos raices:");
            System.out.println( (((this.b*-1)-this.discr)/(2*this.a)) + ", "+(((this.b*-1)+this.discr)/(2*this.a)));
        } else System.out.println("No tiene raices.");
        
    } 
}
