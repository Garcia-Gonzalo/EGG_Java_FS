/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
import java.util.Scanner;


public class ejercicio17 {
    
    private static void completeVector(int [] vectorIntegers, int size) {
        int i;
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Debe ingresar "+size+ " valores");
        for (i=0; i< size; i++){
            System.out.print("Ingrese Num: ");
            vectorIntegers[i] = keyIn.nextInt();
        }        
    }

    private static int counterDigits(int number) {
        double processNumber;
        int digits=0;

        processNumber = (double)number;

        do{
            processNumber = Math.floor(processNumber/10);
            digits += 1;
        } while (processNumber!=0);

        return digits;
    }
    private static void processVector(int [] vectorIntegers, int size) {
        int i, d1=0, d2=0, d3=0, d4=0, d5=0;

        for (i=0; i<size; i++){
            
            switch (counterDigits(vectorIntegers[i])){
                case 1:
                    d1+=1;
                    break;
                case 2:
                    d2+=1;
                    break;
                case 3:
                    d3+=1;
                    break;
                case 4:
                    d4+=1;
                    break;
                case 5:
                    d5+=1;
                    break;
            }
        }
        System.out.println("Se encontraron:");        
        System.out.println(d1+"Numeros de 1 digito");
        System.out.println(d2+"Numeros de 2 digitos");
        System.out.println(d3+"Numeros de 3 digitos");
        System.out.println(d4+"Numeros de 4 digitos");
        System.out.println(d5+"Numeros de 5 digitos");
    }
    public static void ejer17() {
        int size;
        Scanner keyIn = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de  numeros a evaluar:");
        size = keyIn.nextInt();

        int [] vectorIntegers = new int[size];

        completeVector(vectorIntegers, size);

        processVector(vectorIntegers, size);
        
    }
}
