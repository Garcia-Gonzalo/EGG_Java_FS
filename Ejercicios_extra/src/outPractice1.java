
import java.util.Scanner;

public class outPractice1 {

    public static void pyramid(int n) {
        /*
        * Write a program in Java to make such a pattern like a pyramid with a number which will 
        * repeat the number in the same row. 
            1
            2 2
            3 3 3
            4 4 4 4 
        */
        int i,j,b, blankSpaces;
        blankSpaces = n*2 - 1;
        for (i=1; i<= n; i++){
            for (b=1; b<=blankSpaces; b++){
                System.out.print(" ");
            }
            blankSpaces--;

            for (j=1; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
    public static void floysTriangle(int rows) {
        /*. Write a program in Java to print the Floyd's Triangle
         * Input number of rows :  5
                1 
                2 3 
                4 5 6 
                7 8 9 10 
                11 12 13 14 15 
         */
        int i, j, num=1;
        
        for (i=1; i<=rows ;i++ ){
            for (j=1; j<=i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println("");

        }
    }

    public static void printDiamond (int row) {
        // Write a program in Java to display the pattern like a diamond.
        
        int a,b, blank, blankSpaces;
        
        blankSpaces=row;
        //newRows = 2*row-1;
        
        for (a=1; a<=row;a++){
            for (blank=1; blank < blankSpaces;blank++){
                System.out.print(" ");
          
            }
            for (b=1;b<=(a+row-blankSpaces);b++){
                System.out.print("*");
            }
            
            blankSpaces--;
            System.out.println(" ");

        }

        blankSpaces = 1;
        for (a=(row-1); a>=0;a--){
            for (blank=1; blank <= blankSpaces;blank++){
                System.out.print(" ");
          
            }
            for (b=1;b<=(a + (row-blankSpaces-1));b++){
                System.out.print("*");
            }
            
            blankSpaces++;
            System.out.println(" ");

        }

    }
        
    public static String increasingNumbers(int a, int b, int c) {
        /*Write a program that accepts three numbers from the user and prints "increasing" if the 
        numbers are in increasing order, "decreasing" if the numbers are in decreasing order, 
        and "Neither increasing or decreasing order" otherwise. */
        if (a < b){
            if (b<c) return "Incremento";
        } else  if (b > c) return "Decremento";
        
        return "Ninguno";    
    }

    public static void moveZeros(int[] data) {
        int i, index=0;
        int [] newData = new int [data.length];

        for (i=0; i< data.length; i++){
            if (data[i] !=0){
                newData[index] = data[i];
                index++;
            }
        }
        for (i=0; i< data.length; i++){
            System.out.print(newData[i]+" ");
        }   
    }

    public static void main(String[] args) {
        //pyramid(8);
        //pyramid(7);
        
        //floysTriangle(6);
        
        //printDiamond(10);
        
        //System.out.println(increasingNumbers(1, 5, 11));
        //System.out.println(increasingNumbers(9, 4, 0));
        //System.out.println(increasingNumbers(9, 11, 3));
        
        //int[] num = {0,8,9,7,0,7,1,0,6,0};
        //moveZeros(num);
    }
}


