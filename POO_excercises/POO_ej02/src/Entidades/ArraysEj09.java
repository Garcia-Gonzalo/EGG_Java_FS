package Entidades;
import java.util.Arrays;
/*
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
public class ArraysEj09 {
   
    private double[] arregloA = new double[50];
    private double[] arregloB = new double[20];
    
    public ArraysEj09() {

        for (int i=0; i < arregloA.length-1; i++){
            arregloA[i] = Math.random() * 100;
        }
        mostrarArreglo(arregloA);

    }

    private void mostrarArreglo(double[] arreglo) {
        for (int i=0; i < arreglo.length-1; i++){
            System.out.print(arreglo[i]+", ");
            
        }
        System.out.println("-----------------------------------------");
    }
    public void sortArray() {

        Arrays.sort(arregloA);
        
    }
    public void copyArrayToB() {
        for (int i=0; i <arregloB.length-1;i++){
            if (i <=9) arregloB[i] = arregloA[i];
            else arregloB[i]=0.5;
        }
        mostrarArreglo(arregloA);
        mostrarArreglo(arregloB);

    }       
}

