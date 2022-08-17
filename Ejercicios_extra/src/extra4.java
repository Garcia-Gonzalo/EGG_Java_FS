/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
I	1	unus
V	5	quinque
X	10	decem
L	50	quinquaginta
C	100	centum
D	500	quingenti
M	1000	mille
 */
import java.util.Scanner;


//public class extra4 {


public class extra4 {

    public static void loadDigits(int[] digits, int number) {
        int i;
        for (i=3; i>=0;i--){
            digits[i] = number % 10;
            number = (int)(number/10);
        }
    }

    public static void printTimes(String data, int times) {
        int i;
        for (i=0; i<times; i++){
            System.out.print(data);
        }
    }

    public static void convertRoman(int [] digits) {
        int i;
        for (i=0;i<4;i++){
            switch(i){
                case 0:
                    printTimes("M", digits[0]);
                    break;
                case 1:
                    if (digits[i] <5){
                        printTimes("C", digits[1]);
                    } else {
                        System.out.print("D");
                        printTimes("C", (digits[1]-5));
                    }
                    break;
                case 2:
                    if (digits[i] <5){
                        printTimes("X", digits[2]);
                    } else {
                        System.out.print("L");
                        printTimes("X", (digits[2]-5));
                    }
                    break;
                case 3:
                    if (digits[i] <5){
                        if (digits[i]==4){
                            System.out.print("IV");
                        } else{
                            printTimes("I", digits[3]);
                        }   
                    } else {
                        System.out.print("V");
                        printTimes("I", (digits[3]-5));
                    }
                    break;    
            }
        }
        
    }
    public static void ext4() {
        int[] digits = new int [4];
        int number;
        Scanner keyIn = new Scanner(System.in);

        System.out.println("Ingrese un entero menor de 4000");
        do{
            number = keyIn.nextInt();
        } while (number > 4000 || number<0);
        
        loadDigits(digits, number);
        System.out.print("Numero: ");
        convertRoman(digits);
    }

}
