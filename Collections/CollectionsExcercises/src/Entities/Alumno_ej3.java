package Entities;

public class Alumno_ej3 {

    private String name;
    private int[] notas;
    private int count =0;
    
    public Alumno_ej3() {
    }

    public Alumno_ej3(String name) {
        this.name = name;
        this.notas = new int[3];
    }

    public String getName() {
        return name;
    }  

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int nota) {
        if (count <3){
            this.notas[count] = nota;
            count++;
        }
    }
    public double getMean() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += notas[i];
        }
        return sum/3;
    }
    
    @Override
    public boolean equals(Object name2) {
        return this.name.equals(name2);
    }

    @Override
    public String toString() {
        return this.name +":[" + notas[0]+", "+ notas[1]+", "+ notas[2]+"]";
    }
    
}
