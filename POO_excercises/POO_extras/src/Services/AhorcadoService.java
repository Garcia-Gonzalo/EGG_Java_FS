package Services;
import Entities.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    

    public AhorcadoService() {
    }

    public Ahorcado createAhorcado() {
        Ahorcado temp;
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la palabra...");
        
        return temp = new Ahorcado((read.nextLine().toUpperCase()));
    }

   
    private boolean inputOption(Ahorcado word) {
        Scanner read = new Scanner(System.in);
        String inputUser;
        boolean result;

        System.out.println("Ingrese una letra o una palabra");
        inputUser = read.nextLine();
        inputUser = inputUser.toUpperCase();
        
        if (inputUser.length()==1){
            result = word.isLetter(inputUser.charAt(0));
            word.addLetter(inputUser.charAt(0));
            System.out.println("------------------------");
            if (result){
                System.out.println("Acertaste!!");
                result = word.isComplete();
            } else {
                System.out.println("Letra equivocada. Perdiste un intento");
                word.plusError();
            }

        } else {
            result = word.guessWord(inputUser);
            if (result) System.out.println("Felicitaciones Adivinaste");  
            else {
                System.out.println(" ..lo lamento no era "+inputUser+". Perdiste un intento");
                word.plusError();
            } 
        };
        if (word.getErrors()==word.getMaxErrors()){
            System.out.println("Acabaste tus intentos.. perdistes!");
            System.out.println("La palabra era: "+word.getPalabra());
            result=true;
        }
        System.out.println("------------------------");
        return result;
        
    }
    public void menuGame(Ahorcado word) {
        boolean exit = false;
        System.out.println(word.lenGuess());
        
        do{
            word.showStatus();
            exit = inputOption(word);
        } while (!exit);
        word.showStatus();

        
    }
}
