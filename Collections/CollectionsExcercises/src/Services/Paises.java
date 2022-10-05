package Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Paises {

    public static void ingresarPaises(HashSet<String> miConjunto) {
        Scanner read = new Scanner(System.in);
        String option;

        System.out.println("Ingreso de paises. Ingrese x para salir.");
        do {
            System.out.print("Ingrese el pais");
            option = read.nextLine();
            if (!option.equals("x"))
                miConjunto.add(option);
            else
                break;
        } while (true);

        showSet(miConjunto);
    }

    public static void searchAndDelete(HashSet<String> miConjunto) {
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese el pais a eliminar");

        if (miConjunto.remove(read.nextLine())) {
            System.out.println("El elemento se ha eliminado");
            showSet(miConjunto);
        } else
            System.out.println("No se ha encontrado el elemento");
    }

    // completing an test set
    public static void testSet(HashSet<String> miConjunto) {
        miConjunto.add("Argentina");
        miConjunto.add("Brasil");
        miConjunto.add("Chile");
        miConjunto.add("Uruguay");
        miConjunto.add("Bolivia");
        miConjunto.add("Colombia");
        miConjunto.add("Ecuador");
        showSet(miConjunto);
    }

    private static void showSet(HashSet<String> miConjunto) {
        Iterator<String> iter = miConjunto.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void sortSet(HashSet<String> miConjunto) {
        ArrayList<String> data = new ArrayList<>(miConjunto);
        Collections.sort(data);
        for (String element : data) {
            System.out.println(element);
            
        }
        
    }
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();

         ingresarPaises(countries);
        //testSet(countries);

        sortSet(countries);
        searchAndDelete(countries);

    }
}
