/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */

import java.util.Scanner;


public class ejercicio15 {

    public static void ejer15() {
        int [] arrayIntegers = new int[100];
        int i;
        
        for (i=99; i>-1;i--){
            arrayIntegers[i]= i+1;
        }

        for (i=0; i<100;i++){
            System.out.println(arrayIntegers[i]);
        }
    }
    
}
