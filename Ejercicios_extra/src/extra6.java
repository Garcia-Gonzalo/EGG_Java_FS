/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
import java.util.Scanner;

public class extra6 {
    public static void ext6() {
        /*
         * It recieve
         */
        int height=1, lower160Sum=0, lowerCount=0,allSum=0, allCount=0;
        Scanner keyIn = new Scanner((System.in));

        System.out.println("Ingrese las alturas de las personas (num<=0 para terminar");
        while (height>0){
            height = keyIn.nextInt();
            if (height<160){
                lower160Sum += height;
                lowerCount += 1;
            }
            allSum += height;
            allCount +=1;
        }
        System.out.println("El promedio de los menores de 160cm es: "+ (lower160Sum/lowerCount));
        System.out.println("El promedio de todos es: "+ (allSum/allCount));
    }
    
}
