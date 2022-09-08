package Entidad;

import java.util.Scanner;

public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(int isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro() {
        
    }

    public void cargarLibro() {
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Ingrese los datos del libro..");
        System.out.print("Ingrese su nro de ISBN:  ");
        isbn = keyIn.nextInt();
        System.out.println();
        System.out.print("Ingrese el titulo:  ");
        titulo = keyIn.nextLine();
        System.out.println();
        System.out.print("Ingrese el autor:  ");
        autor = keyIn.nextLine();
        System.out.println();
        System.out.print("Ingrese el Nro de paginas");
        paginas = keyIn.nextInt();       
    }

    public void mostrarLibro() {
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Nro Pag: "+ paginas +"  |  ISBN: "+isbn);
        
    }
    
}