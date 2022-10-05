package Services;
import Entities.Mazo;
import Entities.Card;
import java.util.Scanner;

public class Juego_guerra {

    public Juego_guerra() {
        completeName();
        repartir();
    }


    String namePlayer;
    Card[] pc = new Card[24];
    Card[] player = new Card[24];
    int scorePC =0;
    int scorePlayer = 0;

    

    public void completeName() {
        Scanner read = new Scanner(System.in);
        System.out.println("Bienvenido al juego de la guerra");
        System.out.print("Ingrese su nombre: ");
        this.namePlayer = read.nextLine();        
    }

    public void repartir() {
        Mazo thisMazo = new Mazo(48);
        for (int i=0; i<24;i++){
            pc[i] = thisMazo.getOneCard();
        }
        for (int i=0; i<24;i++){
            player[i] = thisMazo.getOneCard();
        }
        
    }

    public void showYourHand() {
        for (int i=0; i<24;i++){
            System.out.print(player[i]);
        }
        
    }

    //test
    public static void main(String[] args) {
        Juego_guerra miJuego = new Juego_guerra();
        miJuego.showYourHand();
    }
    
}
