package Entities;
import java.util.Arrays;

public class Ahorcado {

    private String palabra, lettersSayed="";
    private char[] guess;
    private int maxErrors;
    private int errors = 0;
    
    
    /***************************************************** */
    /* Init methods */

    public Ahorcado(String palabra) {
        this.palabra = palabra;
        this.maxErrors = setMaxErrors();
        setGuess();
    }

    private void setGuess() {
        this.guess = new char[palabra.length()];
        Arrays.fill(guess,'_');
    }

    private int setMaxErrors() {
        /* Define maxErrors para una palabra 70% de intentos */
        return (int) (this.palabra.length() * 0.7);
    }

    /******************************************************************* */
    /* Operation methods */

    public void plusError(){
        this.errors++;
    }

    public void addLetter(char letter) {
        this.lettersSayed+=letter+"-";
    }

    public boolean isComplete() {
        for (int i=0; i< this.guess.length;i++){
            if (guess[i]=='_') return false;
        }
        return true;
    }

    public boolean isLetter(char letter) {
        /* Si encuentra la letra modifica el array de control
         * y devuelve true, de lo contrario devuelve false */
        boolean found = false;
        
        for (int i=0; i < this.guess.length;i++){
            if (this.palabra.charAt(i)==letter){
                found = true;
                guess[i] = letter;  
            }
        }
        return found;
    } 

    public void showStatus() {
        for (int i=0; i<51;i++){
            System.out.print("_");
        }
        
        System.out.println("");
        System.out.println("Palabra de "+(this.palabra.length())+ " letras");
        System.out.println("");

        for (int i=0; i< guess.length;i++){
            System.out.print(guess[i]+" ");   
        }
        System.out.print("    | letras: "+lettersSayed);
        System.out.print("  |  Intentos "+this.errors+"/"+this.maxErrors);
        
        for (int i=0; i<5;i++){
            System.out.println("");
        }
        
        
    }

    public boolean guessWord(String inGuess) {
        return palabra.equals(inGuess);
        
    }
    public String getPalabra() {
        return palabra;
    }

    public int getMaxErrors() {
        return maxErrors;
    }

    public int getErrors() {
        return errors;
    }

    public int lenGuess(){
        return this.guess.length;
    }

    

    

}
