/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */

import java.util.Scanner;

public class ejercicio19 {

    private static void completeMatrix(int[][] maTrix) {
        int i, j;

        for (i=0; i<3;i++){
            for (j=0; j<3; j++){
                maTrix[i][j] = (int)(Math.random()*10);
            }
        }
    }

    public static void showMatrix(int[][] maTrix) {
        int i,j;
        for (i=0; i<3;i++){
            for (j=0; j<3; j++){
                System.out.print(maTrix[i][j]+" ");
            }
            System.out.println("");
        }  
    }

    private static void transposed(int[][] maTrix, int[][] maTrix_T) {
        int i,j;
        for (i=0; i<3;i++){
            for (j=0; j<3; j++){
                maTrix_T[j][i] = maTrix[i][j];
             }
        }
    }

    public static void ejer19() {
        int [][] matrix = new int [3][3];
        int [][] matrixT = new int [3][3];

        completeMatrix(matrix);
        System.out.println("La matriz está completa");
        showMatrix(matrix);
        transposed(matrix, matrixT);
        System.out.println("La matriz se ha transpuesto");
        showMatrix(matrixT);

        
    }
}
