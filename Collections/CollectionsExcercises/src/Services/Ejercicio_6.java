package Services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_6 {

    public static void agregarProducto(HashMap<String,Double> listado) {
        Scanner read = new Scanner(System.in);
        Scanner read2 = new Scanner(System.in);
        String id;
        double price;

        System.out.print("Ingrese el id de producto: ");
        id = read.nextLine();
        System.out.print("Ingrese precio: ");
        price = read2.nextDouble();
        System.out.println("");
        
        listado.put(id, price);      
    }
    
    public static void eliminarProducto(HashMap<String,Double> listado) {
        Scanner read = new Scanner(System.in);
        String id;

        System.out.println("Ingrese el id: ");
        id = read.nextLine();

        if (listado.containsKey(id)){
            listado.remove(id);
            System.out.println("Se ha eliminado con exito");
        } else System.out.println("El elemento no se encuentra en el listado");       
    }

    public static void modificarPrecio(HashMap<String,Double> listado) {
        Scanner read = new Scanner(System.in);
        String id;
        
        System.out.println("Ingrese el id: ");
        id = read.nextLine();
        if (listado.containsKey(id)){
            System.out.println( "El precio actual es: "+ listado.get(id));
            System.out.print("Ingrese el nuevo precio: ");
            listado.put(id, read.nextDouble());
            System.out.println("se ha modificado el precio exitosamente");
        } else System.out.println("El id ingresado no existe");

    }

    public static void mostrar(HashMap<String,Double> listado) {
        for (Map.Entry<String,Double> oneProduct : listado.entrySet()) {
            System.out.println("Producto: "+ oneProduct.getKey()+"- $ "+oneProduct.getValue());
        }
    }

    public static void menu(HashMap<String,Double> listado) {
        Scanner read = new Scanner(System.in);
        int option;
        do{
            System.out.println("Menu: 1.Agregar | 2. Eliminar | 3.Modificar precio | 4.Mostrar | 0.Salir");
            option = read.nextInt();
            switch (option){
                case 1: agregarProducto(listado);
                        break;
                case 2: eliminarProducto(listado);
                        break;
                case 3: modificarPrecio(listado);
                        break;
                case 4: mostrar(listado);
                        break;
            }
        } while (option>0);
    }


    public static void main(String[] args) {
        HashMap<String,Double> listado = new HashMap<>();
        menu(listado);
    }
}
