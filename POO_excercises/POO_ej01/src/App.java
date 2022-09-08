import Entidad.*;

public class App {
    public static void main(String[] args) throws Exception {

        Libro primerL;
        Libro segundoL= new Libro(03456, "El pez", "Jose Peres", 298);

        primerL = new Libro();

        primerL.cargarLibro();

        primerL.mostrarLibro();
        segundoL.mostrarLibro();
    }
}
