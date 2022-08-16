
/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9
 */
import java.util.Scanner;


public class ejercicio20 {
    
    private static boolean magicCube(int[][] maTrix) {
        int i, j, fstDiag=0, scdDiag=0, addNumber, numberResult=0;
        boolean firstTime=true;
        // recorre las filas
        for (i=0; i<3;i++){
            addNumber = 0;
           
            for (j=0; j<3;j++){
                addNumber = addNumber + maTrix[i][j];
                }
            
            if (firstTime){
                numberResult = addNumber;
                firstTime=false;
                System.out.println("number= "+numberResult);
                }
            
                if (numberResult!=addNumber){
                 return false;
                }
        }

        // recorre las columnas
        for (j=0;j<3;j++){
            addNumber=0;
            for (i=0; i<3;i++){
                addNumber = addNumber + maTrix[i][j];
            }
            if (numberResult!=addNumber){
                return false;
            }
        }
        //recorre las diagonales
        for (i=0;i<3;i++){
            fstDiag += maTrix[i][i];
            scdDiag += maTrix[i][2-i];
        }
        if(fstDiag != scdDiag){
            return false;
        } else {
            if (fstDiag != numberResult){
                return false;
            } else{
                return true;
            }
        }
    }

    public static int validateInput() {
        int number;
        boolean correct=false;
        Scanner keyIn =new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 9");
        do{
            number = keyIn.nextInt();
            if (number>=1 && number <=9){
                correct = true;
            } else {
                System.out.println("Ha ingresado un numero invalido");
                System.out.println("Ingrese un numero del 1 al 9");
            }
        } while (!correct);
        return number;

        
    }

    private static void createMagicCube(int[][] maTrix) {
        int i,j,ncounter=0;
        for (i=0;i<3;i++){
            for (j=0; j<3;j++){
                maTrix[i][j] = validateInput();
            }
        }
    }
    
    public static void ejer20() {
        int [][] magic = new int [3][3];
        boolean isMagic;

        createMagicCube(magic);

        /*magic[0][0]=2;
        magic[0][1]=7;
        magic[0][2]=6;
        magic[1][0] = 9;
        magic[1][1]=5;
        magic[1][2]=1;
        magic[2][0]=4;
        magic[2][1]=3;
        magic[2][2]=8;
        */

        ejercicio19.showMatrix(magic);

        isMagic = magicCube(magic);
        
        if (isMagic){
            System.out.println("Es un cuadrado magico!!  :)");
        }   else {
            System.out.println("No es un cuadrado magico :( ");
        }
    }
}
