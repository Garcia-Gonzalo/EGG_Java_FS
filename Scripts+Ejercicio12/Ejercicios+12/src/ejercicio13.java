/*
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */

import java.util.Scanner;

public class ejercicio13 {
    public static void ejer13() {
        
    
    int lines;
    Scanner keyIn = new Scanner(System.in);
    
    System.out.println("Ingrese la cantidad de lineas");
    lines = keyIn.nextInt();

    for (int i=0; i < lines; i++){
        System.out.print("*");
        for (int j = 1; j < lines-1; j++){
            if ((i==0) || (i==lines-1)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("*");
        System.out.println("");
    }
}
}