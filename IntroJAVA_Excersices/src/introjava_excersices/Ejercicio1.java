
package introjava_excersices;
import java.util.Scanner;



public class Ejercicio1 {
    
    public static int ejer1() {
    /*
    Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    dos. El programa deberá después mostrar el resultado de la suma
    */
    int n1,n2;
    Scanner  kboardIn = new Scanner(System.in);
    
    System.out.println("Ingrese dos numeros");
    n1 = kboardIn.nextInt();
    n2 = kboardIn.nextInt();
    
    return n1 +n2;
       
    }
    
    public static void ejer2(){
    /* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
    pantalla.*/
        String name;
        Scanner  kboardIn = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        name = kboardIn.nextLine();
        System.out.println("El nombre es "+name);     
    }
     public static void ejer3(){
    /* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
        String frase;
        Scanner  kboardIn = new Scanner(System.in);
        System.out.println("Ingrese su frase");
        frase = kboardIn.nextLine();
        System.out.println(frase.toLowerCase());     
        System.out.println(frase.toUpperCase());     
    }
    
    public static double ejer4(double gradosCen){
    /* 
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
        return  32 + (9*gradosCen)/5;
    }
    
    public static void ejer5(){
    /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt()*/
        double num;
        Scanner keyIn = new Scanner(System.in);
        System.out.print("Ingrese el Nro :");
        num = keyIn.nextInt();
        System.out.println(2*num + " " + 3*num+ " "+Math.sqrt(num));
    }
    
}
