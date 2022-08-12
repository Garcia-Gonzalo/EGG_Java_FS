/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */


import java.util.Scanner;


public class ejercicio16 {

    public static void completeVector(int [] vectorIntegers, int numElem) {
        int i;
        for (i=0; i<numElem; i++){
            vectorIntegers[i] = (int)(Math.random()*100);
        }
        System.out.println(vectorIntegers[5]);
        System.out.println("El vector se ha cargado..");
        /*for (i=0; i<numElem; i++){
            System.out.print(vectorIntegers[i]+", ");
        }*/
    }

    public static void searchNumber(int [] vectorIntegers, int numElem, int toSearch) {
        int i, counter=0;
        boolean found = false;

        for (i=0; i<numElem;i++){
            if (vectorIntegers[i] == toSearch){
                System.out.println(toSearch+" se encontró en la posicion "+i);
                counter += 1;
                found = true;
            }
        }
        if (!found){
            System.out.println("No se ha encontrado el numero");        
        } else {
            System.out.println("El numero "+toSearch+" se halló "+counter+" veces.");
        }
    }

    public static void ejer16() {
        int size, toSearch;
        Scanner keyIn = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array");
        size = keyIn.nextInt();

        int [] vectorArray = new int [size];

        completeVector(vectorArray, size);

        System.out.println("Ingrese el numero a buscar");
        do{
            toSearch = keyIn.nextInt();
        }while (toSearch<0 || toSearch>100);

        searchNumber(vectorArray, size, toSearch);
    }
}
