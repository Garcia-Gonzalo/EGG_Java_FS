/*
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */


import java.util.Scanner;

public class ejercicio21 {
    
    private static boolean compareSubmatrix(int [][] maTrix, int [][] submaTrix, int row, int column) {
        int[] flattenMatrix = new int[9];
        int[] flattenSubMatrix = new int[9];
        int i,j,count=0;
        
        //loading vector of 9 elements from the bigest matrix
        //System.out.println("APlanando la matriz..");
        for (i=row; i < row+3; i++){
            for (j=column; j< column+3; j++){
                
                flattenMatrix[count] = maTrix[i][j];
                count += 1;             
            }
        }
        //System.out.println("Aplanando la submatriz..");
        //loading vector of 9 elements from the lowest matrix

        count=0;
        for (i=0; i < 3; i++){
            for (j=0; j< 3; j++){
                flattenSubMatrix[count] = submaTrix[i][j];
                count += 1;
            }
        }
        // comparing element wise
        for (i=0; i<9;i++){
            //System.out.println(flattenMatrix[i] + "," + flattenSubMatrix[i]);
            if (flattenMatrix[i] != flattenSubMatrix[i]){
                return false;
            }
        }
        return true;

    }
    public static void createMatrix(int [][] bigMatrix, int [][] subMatrix) {
        int i, j;

        System.out.println("Vamos a cargar la matriz de 10x10");
        for (i=0; i<10; i++){
            for(j=0; j<10; j++){
                bigMatrix[i][j] = validateInput();
            }
            System.out.println("linea "+i+" completa");
        }

        System.out.println("Vamos a cargar la matriz de 3x3");
        for (i=0; i<3; i++){
            for(j=0; j<3; j++){
                bigMatrix[i][j] = validateInput();
            }
            System.out.println("linea "+i+" completa");
        }
    }
    public static int validateInput() {
        int number;
        boolean correct=false;
        Scanner keyIn =new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 100");
        do{
            number = keyIn.nextInt();
            if (number>=1 && number <=100){
                correct = true;
            } else {
                System.out.println("Ha ingresado un numero invalido");
                System.out.println("Ingrese un numero del 1 al 100");
            }
        } while (!correct);
        return number;
    }
    public static void createMatrix2(int [][] bigMtarix) {
        int i,j;
        for (i=0; i<10;i++){
            for (j=0;j<10;j++){
                bigMtarix[i][j] = i+j;
                System.out.print(bigMtarix[i][j]+"   ");
            }
            System.out.println("");
        }
     
    }

    public static void ejer21() {
        int[][] bigMatrix = new int [10][10];
        int[][] subMatrix = new int [3][3];
        int i, j;
        boolean exist=false;

        // opcion de ingresar los valores de las matrices
        //createMatrix(bigMatrix, subMatrix);

        //Crea la matriz de 10x10 automaticamente y la muestra
        createMatrix2(bigMatrix);
        // Esta submatriz sabemos que esta presente
        subMatrix[0][0]=2;
        subMatrix[0][1]=3;
        subMatrix[0][2]=4;
        subMatrix[1][0]=3;
        subMatrix[1][1]=4;
        subMatrix[1][2]=5;
        subMatrix[2][0]=4;
        subMatrix[2][1]=5;
        subMatrix[2][2]=6;
        

        for (i=0; i<8;i++){
            for (j=0; j<8; j++){
                exist = compareSubmatrix(bigMatrix, subMatrix, i, j);
                if (exist){
                    System.out.println("Se ha encontrado la submatriz en la posicion "+i+","+j);
                    exist=false;
                } 
            }
        }      
    }
}
