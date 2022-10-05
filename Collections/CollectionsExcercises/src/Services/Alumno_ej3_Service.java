package Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Entities.Alumno_ej3;

public class Alumno_ej3_Service {

    public static Alumno_ej3 crearAlumno() {
        Alumno_ej3 alumnoTemp;
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese el nombre del alumno: ");
        alumnoTemp = new Alumno_ej3(read.nextLine());
        System.out.println("");
        System.out.println("Ingrese las 3 notas");
        for (int i = 0; i < 3; i++) {
            alumnoTemp.setNotas(read.nextInt());
        }
        return alumnoTemp;
    }

    public static boolean exitInput() {
        Scanner read = new Scanner(System.in);
        String option;
        do {
            System.out.println("Desea cargar otro alumno? s/n");
            option = read.nextLine().toLowerCase();
        } while (!(option.equals("s") || option.equals("n")));
        return option.equals("s");
    }

    public static void show(ArrayList<Alumno_ej3> lista) {
        for (Alumno_ej3 pointer : lista) {
            System.out.println(pointer);
        }

    }

    public static boolean searchAndMean(ArrayList<Alumno_ej3> alumnos) {
        boolean found = false;
        Iterator<Alumno_ej3> iter = alumnos.iterator();
        String name;
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno");
        name = read.nextLine();
        Alumno_ej3 pointer;

        while (iter.hasNext()) {
            pointer = iter.next();
            if (pointer.getName().equals(name)) {
                System.out.println(pointer + " tiene un promedio de " + pointer.getMean());
                found = true;
            }
        }
        return found;
    }

    private static void testSearchAndMean() {
        ArrayList<Alumno_ej3> alumnos = new ArrayList<>();
        String[] names = { "Jose", "Maria", "Juan", "Marta" };
        for (int i = 0; i < names.length; i++) {
            alumnos.add(new Alumno_ej3(names[i]));
            for (int j = 0; j < 3; j++) {
                alumnos.get(i).setNotas((int) (Math.random() * 10));
            }
        }
        show(alumnos);

        for (Alumno_ej3 alumno : alumnos) {
            System.out.println(alumno + "= " + alumno.getMean());

        }

        searchAndMean(alumnos);

    }

    public static void main(String[] args) {
        // testSearchAndMean();

        ArrayList<Alumno_ej3> alumnos = new ArrayList<>();

        do {
            alumnos.add(crearAlumno());

        } while (exitInput());

        show(alumnos);

        if (!searchAndMean(alumnos))
            System.out.println("No se ha encontrado el alumno");

    }
}
