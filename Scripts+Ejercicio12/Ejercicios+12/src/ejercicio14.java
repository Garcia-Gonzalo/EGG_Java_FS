/*
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */

import java.util.Scanner;

public class ejercicio14 {
    public static void converEuros(double eur, int toChange) {
        switch (toChange){
            case 1:
                System.out.println("Son "+(Math.round(eur*1.28611))+" dolares");
                break;
            case 2:
                System.out.println("Son "+(Math.round(eur*129.852))+" yenes");
                break;
            case 3:
                System.out.println("Son "+(Math.round(eur*0.86))+" libras");
                break;
        }
    }   
    public static void ejer14() {
        double eur;
        int coinType;
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        eur = keyIn.nextDouble();
        //keyIn.nextLine();
        System.out.println("Seleccione el tipo de moneda");
        System.out.println("1.Dolar      2.Yen      3.Libra");
        do{
            coinType = keyIn.nextInt();
        } while (coinType!=1 && coinType!=2 && coinType!=3);

        converEuros(eur, coinType);

        
    } 
}
