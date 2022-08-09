/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio0;
import java.util.Scanner;

/**
 *
 * @author gonzalo_garcia
 */
public class Ejercicio0 {
    public static void ValorarNota(){
        int nota = -1;
        Scanner lectura = new Scanner(System.in);
        
        while ((nota<0) || (nota>10)){
            System.out.print("Ingrese la nota: ");
            nota = lectura.nextInt();
        }
        System.out.println("La nota se ha ingresado correctamente");
    }
    
    public static void NumerosHasta20(){
        int suma, number;
        Scanner keyboardIn = new Scanner(System.in);
        suma = 0;
        
        System.out.println("Ingrese 20 numeros, 0 para salir.");
        
        for (int i = 0; i < 21; i++) {
            
            number = keyboardIn.nextInt();
            
            if (number == 0){
                System.out.println("Se capturo el nro 0");
                break;
            }else { if (number>0) {
                
                suma = suma +number;
                }
            }
            
        }
        System.out.println("La suma es"+suma);
    }
   
    public static void ejercicio10(){
        int num1, num2, num3, num4;
        Scanner keyInput = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros 1 al 20");
        num1 = keyInput.nextInt();
        num2 = keyInput.nextInt();
        num3 = keyInput.nextInt();
        num4 = keyInput.nextInt();
        
        System.out.print(num1+" ");
        for (int i = 0; i <= num1; i++) {
            System.out.print("*");
            }
        System.out.println("");
        
        System.out.print(num2+" ");
        for (int i = 0; i <= num2; i++) {
            System.out.print("*");
            }
        System.out.println("");
        
        System.out.print(num3+" ");
        for (int i = 0; i <= num3; i++) {
            System.out.print("*");
            }
        System.out.println("");
        
                System.out.print(num4+" ");
        for (int i = 0; i <= num4; i++) {
            System.out.print("*");
            }
        System.out.println("");
        }
    
    public static char decoder(char toDecode){
        
        switch (toDecode){
            case 'a':
              return '@';
            case 'e':
              return '#';
            case 'i':
              return '$';
            case 'o':
              return '%';
            case 'u':
              return '*';
            default:
                return toDecode;
        }
    }
    
    public static void ejercicio11(){
        String frase, fraseDecode;
        Scanner keyInput = new Scanner(System.in);
        
        fraseDecode = "";
        System.out.print("Ingrese una frase");
        frase = keyInput.nextLine();
        
        for (int i = 0; i < frase.length(); i++) {
            fraseDecode = fraseDecode + decoder(frase.charAt(i));
        }
        System.out.println(fraseDecode);            
    }
    
    public static void ejercicio12(){
        int num1, num2, result;
        Scanner keyInput = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        // Validacion que  no sean 0
        num1 = keyInput.nextInt();
        num2 = keyInput.nextInt();
        
        if (num1 > num2){
            result = num1 % num2;
        }else{
            result = num2 % num1;
        }
        if (result==0){
            System.out.println("Los numeros son multiplos");
        } else {
            System.out.println("Los numeros no son multiplos");
        }
    }
    
    public static void ejercicio13y14(){
        String [] equipo =  new String[5];
        Scanner kbrdInput = new Scanner(System.in);
        System.out.println("Ingrese los nombres de 5 jugadores...");
        for (int i = 0; i < 5; i++) {
            System.out.print("Jugador "+i+": ");
            equipo[i] = kbrdInput.nextLine();
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(equipo[i]);
            
        }
    }
    
    

    public static void main(String[] args) {
        //ValorarNota();
        //NumerosHasta20();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13y14();
        
        }
 }
    
