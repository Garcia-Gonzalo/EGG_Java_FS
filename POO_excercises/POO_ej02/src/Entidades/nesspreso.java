package Entidades;

public class nesspreso {
    
    private final int capacidadMaxima = 500;
    private int capacidadActual = 0;
    
    public nesspreso(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    public nesspreso() {
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public int getCapacidadActual() {
        return capacidadActual;
    }
    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        capacidadActual = capacidadMaxima;
    }
    public void servirTaza(int size) {
        if (capacidadActual>size){
            capacidadActual-= size;
            System.out.println("Se sirvio la taza");
        } else {
            
            System.out.println("No hay suficiente cafe para lenar la taza, se sirvieron "+capacidadActual+" ml");       
            capacidadActual=0;
        }    
    }
    public void vaciarCafetera() {
        capacidadActual = 0;
        
    }
    public void lenarCafetera(int size) {
        if (size <= capacidadMaxima) capacidadActual = size;
        else capacidadActual = capacidadMaxima;
        System.out.println("Se cargó la cafetera");       
    }

    public boolean cafeteraVacia() {
        if (capacidadActual==0) return true;
        else return false;
    }
    
    

    

    
}
