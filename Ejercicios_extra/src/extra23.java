/*
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
 */

import java.util.Scanner;

public class extra23 {

    public static String readAndValidate() {
        Scanner keyIn = new Scanner(System.in);
        String word;
        do{
            System.out.println("Ingrese una paabra entre 3 y 5 caracteres");
            word = keyIn.nextLine();
        } while (word.length()<3 || word.length()>6);
        return word;
    }

    public static void insertWord(char [][] soup, String word, int row) {
        int i,j;
        do{
            j = (int) (Math.random()*19);
        } while (j > (19 - word.length()));
        
        for (i=0; i<word.length();i++){
            soup[row][j+i] = word .charAt(i);
        }        
    }

    public static void createSoup(char [][] soup) {
        int i;
        String word;
        for (i=0; i<20; i++){
            insertWord(soup, readAndValidate(), i);
        }
    }

    public static void showSoup(char[][] soup) {
        int i,j;
        for (i=0;i<20;i++){
            for(j=0;j<20;j++){
                System.out.print(soup[i][j] +  " ");
            }
            System.out.println("");
        }
    }
    public static void initSoup(char[][] soup) {
        int i,j;
        for (i=0;i<20;i++){
            for(j=0;j<20;j++){
                soup[i][j]= '@';
            }
        }
    }

    public static void main(String[] args) {
        char[][] soup = new char[20][20];
        initSoup(soup);
        createSoup(soup);
        showSoup(soup);
        
    }
    
    


}