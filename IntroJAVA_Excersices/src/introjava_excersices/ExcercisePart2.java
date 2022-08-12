/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava_excersices;
import java.util.Scanner;


/**
 *
 * @author gonzalo_garcia
 */
public class ExcercisePart2 {
    
    public static void ejer6(){
        //Crear un programa que dado un numero determine si es par o impar.
        int n1;
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Ingrese el Nro");
        n1 = keyIn.nextInt();
        if (n1 % 2 == 0){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
    public static void ejer7(){
    /* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
    pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
    la función equals() en Java. */
        String frase;
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Ingrese la frase:");
        frase = keyIn.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
    public static void ejer8(){
    /* Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
    usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
    Nota: investigar la función Lenght() en Java. */
        String frase;
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Ingrese la frase:");
        frase = keyIn.nextLine();
        if (frase.length()==8){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
    public static void ejer9(){
    /* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
    es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
    diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
    la función Substring y equals() de Java. */
        String frase;
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Ingrese la frase:");
        frase = keyIn.nextLine();
        frase = frase.substring(0,1);
        if (frase.equals("A")){
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
    public static void ejer10(){
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
        int suma, limite;
        Scanner keyIn = new Scanner(System.in);
        suma = 0;
        System.out.println("Ingrese el limite");
        limite = keyIn.nextInt();
        while (suma < limite){
            System.out.println("Ingrese el nro");
            suma = suma + keyIn.nextInt();
        }
        System.out.println(suma);
          
        }

    public static boolean exitConfirmation() {
        String optionKey;
        Scanner keyIn = new Scanner(System.in);
        System.out.print("Seguro quiere salir? s/n");
        optionKey = keyIn.nextLine().toLowerCase();
        if (optionKey.equals("s")){
            return true;
        } else {
            return false;
             }   
    }

    public static void menu(int n1, int n2) {
        int optionKey;
        boolean valid=false;
        Scanner keyIn = new Scanner(System.in);
        do{
            System.out.println("Ingrese su opcion:");
            System.out.println("1.Sumar\n2.Restar\n3.Muliplicar\n4.Dividir\n5.Salir");
            optionKey = keyIn.nextInt();
            switch (optionKey){
                case 1:
                    System.out.println(n1 +n2);
                    break;
                case 2:
                    System.out.println(n1 -n2);
                    break;
                case 3:
                    System.out.println(n1 *n2);
                    break;
                case 4:
                        if (n2>0){
                            System.out.println(n1 /n2);
                        
                        } else {
                            System.out.println("No se puede dividir por cero");
                        }
                        break;
                case 5: 
                        valid = exitConfirmation();

                 }
        } while (!valid);
    }

    public static void ejercicio11() {
        int n1, n2;
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        n1 = keyIn.nextInt();
        n2 = keyIn.nextInt();
        menu(n1, n2);
        
    }
        
}
