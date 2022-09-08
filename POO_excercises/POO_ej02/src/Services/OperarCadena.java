package Services;
import Entidades.Cadena;
import java.util.Scanner;

public class OperarCadena {

    public static Cadena crearCadena(){
        Cadena temp = new Cadena();
        Scanner keyIn = new Scanner(System.in);

        System.out.println("Ingrese la frase");
        temp.setFrase(keyIn.nextLine());
        return temp;   
    }

    public static void mostrarVocales(Cadena fraseEvaluar) {
        String frase = fraseEvaluar.getFrase();

        for (int i=0;i< fraseEvaluar.getLongitud()-1; i++){
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'o'
            || frase.charAt(i) == 'u' || frase.charAt(i) == 'i') System.out.print(frase.charAt(i));
        }
        System.out.println("");
        
    }
          
    public static void invertirFrase(Cadena fraseEvaluar) {
        String frase = fraseEvaluar.getFrase();

        for (int i=fraseEvaluar.getLongitud()-1; i >=0 ; i--){
            System.out.print(frase.charAt(i));
        }
        System.out.println("");
        
    }

    public static void vecesRepetido(Cadena fraseEvaluar) {
        String letra;
        String frase = fraseEvaluar.getFrase();
        int cont=0;
        Scanner keyIn = new Scanner(System.in);
        
        System.out.print("Ingrese la letra:  ");
        letra = keyIn.nextLine();

        for (int i=0;i< fraseEvaluar.getLongitud()-1; i++){
            if (frase.charAt(i) == letra.charAt(0)) cont ++;
        }
        
        System.out.println("La letra "+letra+" aparece "+cont+" veces.");
    }
    public static String compararLongitud(Cadena long1, String long2) {
        if (long1.getLongitud() < long2.length()) return "menor";
        else    if (long1.getLongitud() > long2.length()) return "mayor";
                else return "iguales";
    }
    public static void unirFrases(Cadena fraseA, String fraseB) {
        System.out.println(fraseA.getFrase()+" "+fraseB);
    }
    public static void reemplazarA(Cadena frase, String letra) {
        String fraseEvaluar = frase.getFrase();
        for (int i=0; i<frase.getLongitud()-1;i++ ){
            if (fraseEvaluar.charAt(i)=='a') System.out.print(letra);
            else System.out.print(fraseEvaluar.charAt(i));
        }
        System.out.println("");    
    }
    public static boolean contieneLetra(Cadena frase, String letra) {
        String fraseEvaluar = frase.getFrase();
        for (int i=0; i<frase.getLongitud()-1;i++ ){
            if (fraseEvaluar.charAt(i)== letra.charAt(0)) return true;
        }
        return false;
    }

}
