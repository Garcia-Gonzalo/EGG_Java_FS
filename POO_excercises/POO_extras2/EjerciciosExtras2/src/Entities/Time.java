package Entities;

public class Time {

    private int horas, minutos, segundos;
    private final int maxHs=23;
    private final int maxMin=59;
    private final int maxSeg=59;

    public Time(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Time() {
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    @Override
    public String toString() {
        return this.horas+":"+this.minutos+":"+this.segundos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public int getMaxHs() {
        return maxHs;
    }

    public int getMaxMin() {
        return maxMin;
    }

    public int getMaxSeg() {
        return maxSeg;
    }
    


    
    
}
