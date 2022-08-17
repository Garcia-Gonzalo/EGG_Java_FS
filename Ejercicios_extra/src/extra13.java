/*
 * Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar.
 */
import java.util.Scanner;

public class extra13 {

    public static void numberStairs(int size) {
        int i,z, counter;
        for (i=1; i<size+1; i++){
            counter=0;
            for (z=1; z <i+1;z++){
                counter+=1;
                System.out.print(counter);
            }
            System.out.println("");
        }
    }
    public static void ext13() {
        Scanner keyIn = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la escalera");

        numberStairs(keyIn.nextInt());

        
    }
}
