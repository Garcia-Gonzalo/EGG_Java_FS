package Entities;
import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNac;
    private int age;
    

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Persona(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    public Persona() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    } 
    @Override
    public String toString() {
        return "Nombre: "+ this.nombre+" | Fdenac: "+this.fechaNac+" | Edad: "+this.age;
    }
    
    
}
