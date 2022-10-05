package Entities;

public class Pelicula {

    private String titulo;
    private int duracionMin;
    private String director;
    
    public Pelicula() {
    }

    public Pelicula(String titulo, int duracionMin, String director) {
        this.titulo = titulo;
        this.duracionMin = duracionMin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return this.titulo+"("+this.duracionMin+"min)-dir: "+this.director;
    }
    
}
