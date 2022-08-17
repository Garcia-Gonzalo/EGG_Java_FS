/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */

import java.util.Scanner;


public class extra3 {
    public static boolean isVocal(String letter) {
        letter = letter.toLowerCase();
        if (letter.equals("a") || letter.equals("e") ||letter.equals("i")
            || letter.equals("o") || letter.equals("u")){
                return true;
            } else {
                return false;
            }      
    }

    public static void searchVocal() {
        Scanner keyIn = new Scanner(System.in);

        System.out.println("Ingrese un caracter");
        
        if (isVocal(keyIn.nextLine())){
            System.out.println("Es una vocal");
        }   else {
            System.out.println("No es una vocal");
        }
        
    }
    
}
