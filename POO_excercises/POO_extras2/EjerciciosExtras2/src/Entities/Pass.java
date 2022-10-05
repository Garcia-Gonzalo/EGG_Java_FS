package Entities;
import java.util.Scanner;

public class Pass {
    
    private String pass;
    private String nombre;
    private int dni;
    
    public Pass(String nombre, int dni) {
        this.pass = crearPass();
        this.nombre = nombre;
        this.dni = dni;
    }

    public String crearPass() {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese su password: ");
        return read.nextLine();       
    }

    public String getPass() {
        return pass;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPass(String pass){
        this.pass = pass;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return this.nombre + " | " + this.dni;
    }
    

}
