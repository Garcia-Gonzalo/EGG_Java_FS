package Entities;
import java.util.Scanner;

public class Dni {

    int dni;
    char nif;

    public Dni() {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el nro de DNI");
        this.dni = read.nextInt();
        this.nif = returnNif();
        System.out.println("DNI y NIF creados exitosamente");
    }

    private char returnNif() {
        char[] tableNif = {'T', 'R', 'W','A','G', 'M', 'Y', 'F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return tableNif[(this.dni % 23)];
        
    }

    @Override
    public String toString() {
        return this.dni+"-"+this.nif;
    }

    public int getDni() {
        return dni;
    }

    public char getNif() {
        return nif;
    }

    public void setDni(int dni) {
        this.dni = dni;
        this.nif = returnNif();
    }

    
}
