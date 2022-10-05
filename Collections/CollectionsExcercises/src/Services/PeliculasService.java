package Services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import Entities.Pelicula;

public class PeliculasService{

    // instancia objetos Comparator
    private Comparator<Pelicula> comparaDuracionMaxtoMin = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            if (p1.getDuracionMin() > p2.getDuracionMin()) return -1;
            if (p1.getDuracionMin() < p2.getDuracionMin()) return 1;
            else return 0;

        }
    };

    private Comparator<Pelicula> comparaDuracionMinToMax= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            if (p1.getDuracionMin() > p2.getDuracionMin()) return 1;
            if (p1.getDuracionMin() < p2.getDuracionMin()) return -1;
            else return 0;

        }
    };

    private Comparator<Pelicula> ordenarPorTitulo= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };

    private Comparator<Pelicula> ordenarPorDirector= new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };

    // Constructores
    public PeliculasService() {
    }

    // Metodos
    public void cargarPeliculas(ArrayList<Pelicula> listaPelis) {
        Scanner read1 = new Scanner(System.in);
        Scanner read2 = new Scanner(System.in);
        Scanner read3 = new Scanner(System.in);
        Scanner read4 = new Scanner(System.in);

        String option, nombrePeli, director;
        int duracionPeli;

        System.out.println("Comience con la carga de peliculas:");

        do{
            
            System.out.println("Ingrese el titulo: ");
            nombrePeli = read1.nextLine();
            System.out.println("Ingrese el director: ");
            director = read2.nextLine();
            System.out.println("Ingrese la duracion: ");
            duracionPeli = read3.nextInt();
            System.out.println("");
            listaPelis.add(new Pelicula(nombrePeli, duracionPeli, director));

            System.out.print("Desea cargar otra pelicula? s/n  ");
            option = read4.nextLine();
            
        } while (option.equals("s"));
    }

    public void show(ArrayList<Pelicula> listaPelis) {
        Iterator<Pelicula> iter = listaPelis.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public void ordernarTitulo(ArrayList<Pelicula> laLista){
        Collections.sort(laLista, ordenarPorTitulo);
        show(laLista);
    }

    public void ordernarDirector(ArrayList<Pelicula> laLista){
        Collections.sort(laLista, ordenarPorDirector);
        show(laLista);
    }
    
    public void ordenarDuracionToMax(ArrayList<Pelicula> laLista){
        Collections.sort(laLista, comparaDuracionMinToMax);
        show(laLista);
    }

    public void ordenarDuracionToMin(ArrayList<Pelicula> laLista){
        Collections.sort(laLista, comparaDuracionMaxtoMin);
        show(laLista);
    }

    public void selectFor(ArrayList<Pelicula> laLista){
        Scanner read = new Scanner(System.in);
        Iterator<Pelicula> iter = laLista.iterator();
        Pelicula actualItem;
        int limit;
        System.out.print("Ingrese cuantos minutos de duracion desea filtrar: ");
        limit = read.nextInt();
        while (iter.hasNext()){
            actualItem = iter.next();
            if (actualItem.getDuracionMin() > limit){
                System.out.println(actualItem);
            }
        }
        
    }


    // Array completo de testeo
    public void arrayDeTest(ArrayList<Pelicula> testArray){
        testArray.add(new Pelicula("Zorro",201,"J.Roldan"));
        testArray.add(new Pelicula("Alvin",145 ,    "M.a"));
        testArray.add(new Pelicula("Titanic",188,"C.m"));
        testArray.add(new Pelicula("Polo",148,"Z.w"));
        testArray.add(new Pelicula("Diavolo",159,"H.E"));
        testArray.add(new Pelicula("Rio",196,"LM"));
    }
    // test
    public static void main(String[] args) {
        ArrayList<Pelicula> coleccionPeliculas = new ArrayList<>();

        PeliculasService listado = new PeliculasService();

        listado.cargarPeliculas(coleccionPeliculas);
        //listado.arrayDeTest(coleccionPeliculas);

        listado.show(coleccionPeliculas);
        System.out.println("-----------------------");
        listado.ordernarTitulo(coleccionPeliculas);
        System.out.println("-----------------------");
        listado.ordernarDirector(coleccionPeliculas);
        System.out.println("-----------------------");
        listado.ordenarDuracionToMax(coleccionPeliculas);
        System.out.println("-----------------------");
        listado.ordenarDuracionToMin(coleccionPeliculas);
        System.out.println("-----------------------");
        listado.selectFor(coleccionPeliculas);


    }

}

    
