package Entities;

import Entities.Card;
import java.util.Random;

public class Mazo {

    Card[] mazo;
    int sizeMazo;
    int cardsLeft;
    boolean empty = false;

    public boolean isEmpty() {
        return empty;
    }

    public Mazo(int size) {
        int index = 0;
        String[] palos = { "Espada", "Basto", "Oro", "Copa" };
        this.sizeMazo = size;
        this.mazo = new Card[size];

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                if (size == 40) {
                    if (j != 8 && j != 9) {
                        this.mazo[index] = new Card(j, palos[i]);
                        index++;
                    }
                } else {
                    this.mazo[index] = new Card(j, palos[i]);
                    index++;
                }
            }
        }
        this.cardsLeft = size;
    }

    public Card getOneCard() {
        int index;
        Random rnd = new Random();

        do {
            index = rnd.nextInt(this.sizeMazo);
            if (!this.mazo[index].isDelivered()) {
                cardsLeft--;
                if (cardsLeft == 0)
                    this.empty = true;
                this.mazo[index].hasDelivered();
                return this.mazo[index];
            }
        } while (true);
    }

    /**
     * 
     * @param position
     * @return
     */
    public Card getCard(int position) {
        return this.mazo[position];

    }

    // test main
    public static void main(String[] args) {
        Mazo testMazo = new Mazo(48);
        int count = 0;
        do {
            System.out.println(testMazo.getOneCard());
            count++;
        } while (!testMazo.isEmpty());
        System.out.println(count);

    }
}
