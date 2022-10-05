
/*
 * Crea y guarda nombres de raza de perros
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Ejercicio1y2 {

    private static String getRaza() {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese la raza: ");
        return read.nextLine();
    }

    private static boolean another() {
        Scanner read = new Scanner(System.in);
        String inpuString;
        do {
            System.out.println("Desea agregar otro perro? s/n");
            inpuString = read.nextLine();
            inpuString = inpuString.toLowerCase();
        } while (!(inpuString.equals("s") || inpuString.equals("n")));
        return inpuString.equals("s");
    }

    private static void showRazas(ArrayList<String> razas) {
        for (String pointer : razas) {
            System.out.print(pointer + ", ");
        }
        System.out.println("");
    }

    private static boolean searchAndRemove(ArrayList<String> lista){
        boolean result = false;
        Scanner read = new Scanner(System.in);
        Iterator it = lista.iterator();
        String target;
        System.out.print("Ingrese la raza a eliminar");
        target = (read.nextLine()).toLowerCase();
        while (it.hasNext()){
            if (it.next().equals(target)){
                lista.remove(target);
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList<>();
        do {
            razas.add(getRaza());
        } while (another());
        showRazas(razas);
    
        if (searchAndRemove(razas))
            System.out.println("Se elimino la raza");
        else System.out.println("No se encontró la raza");

        showRazas(razas);

    }

}
