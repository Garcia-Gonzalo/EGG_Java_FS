/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas. */
import java.util.Scanner;

public class extra1{
    public static int inputMinutes() {
        Scanner keyIn = new Scanner(System.in);
        System.out.print("Ingrese los minutos..");
        return keyIn.nextInt();
    }
    public static void calculateDays(int min) {
        int days, hours;

        days = (int)(Math.floor((min/60)/24));
        hours = (int)((min/60)%24);

        System.out.println(days+" dias, "+hours+" horas");
        
    }
    public static void ext1() {
        calculateDays(inputMinutes());
        
    }
}