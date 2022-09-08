package Entidades;
import java.time.LocalDate;

public class Persona2 {

    private String Nombre;
    private LocalDate fechaNac;

    public Persona2(String nombre, LocalDate fechaNac) {
        Nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public Persona2() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
}
