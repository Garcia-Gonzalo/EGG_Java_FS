/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio0.pkg1;
import java.util.Scanner;


/**
 *
 * @author gonzalo_garcia
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        num=-1;
        
        while (num<0 || num>10){
            System.out.print("Ingrese la nota:  ");
            num = leer.nextInt();
            System.out.println("");
        }
        
        
        
    }
    
}
