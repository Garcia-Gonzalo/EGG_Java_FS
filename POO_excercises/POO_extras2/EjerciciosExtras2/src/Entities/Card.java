package Entities;

public class Card {

    private int valor;
    private String palo;
    private boolean delivered;

    public Card(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
        delivered = false;
    }

    public int getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    public boolean isDelivered() {
        return this.delivered;
        
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    public void hasDelivered() {
        this.delivered = true;
    }

    @Override
    public String toString() {
        return valor+"-"+palo;
    }

    
}
