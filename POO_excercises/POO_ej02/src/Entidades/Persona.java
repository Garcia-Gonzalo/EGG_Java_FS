package Entidades;
import java.util.Scanner;

public class Persona {
    
    String nombre, sexo;
    int edad;
    double peso, altura, imc;
    
    public Persona(String nombre, String sexo, int edad, double peso, double altura) {
        
        this.sexo = validateSexo(sexo);
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        
        calculateIMC();
    }

    public Persona() {
    }

    public static Persona crearPersona() {
        Scanner keyIn = new Scanner(System.in);
        Persona estaPersona = new Persona();

        System.out.println("Ingrese Nombre: ");
        estaPersona.nombre = keyIn.nextLine();
        System.out.println("Ingrese edad: ");
        estaPersona.edad = keyIn.nextInt();
        System.out.println("Ingrese sexo: ");
        estaPersona.sexo = validateSexo(keyIn.next());
        System.out.println("Ingrese altura: ");
        estaPersona.altura = keyIn.nextDouble();
        System.out.println("Ingrese peso: ");
        estaPersona.peso = keyIn.nextDouble();
        estaPersona.calculateIMC();

        return estaPersona;
    }

    private static String validateSexo(String sexo) {
        if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) return sexo;
        else  {
            System.out.println("El sexo esta mal ingresado");
            return "";
        }
    }

        
    
    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        return imc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private void calculateIMC() {
        this.imc = this.peso / Math.pow(this.altura,2);
    }

    public int imcValue() {
        if (this.imc <20) return -1;
        else if (this.imc < 26) return 0;
        else return 1;        
    }
    public boolean mayorEdad() {
        return this.edad >19;
    }
    
}
