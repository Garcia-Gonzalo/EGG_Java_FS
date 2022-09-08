/*
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
import java.util.Scanner;

public class extra14 {

    public static void main(String[] args) {
        int families, totalSons=0, sons, agesAdded=0;
        Scanner keyIn = new Scanner(System.in);

        System.out.println("Ingrese cuantas familias hay");
        families = keyIn.nextInt();

        for (int i=0; i<families;i++){
            sons=0;
            System.out.println("Ingrese la cantidad de hihos para la familia "+ (i+1));
            sons= keyIn.nextInt();
            totalSons += sons;
            for (int j=0; j<sons;j++){
                System.out.println("Ingrese la edad para el hijo numero "+(j+1));
                agesAdded += keyIn.nextInt();
            }
        }   
        System.out.println("La edad media de todos los hijos es "+ (agesAdded/totalSons));
    }
    
} 