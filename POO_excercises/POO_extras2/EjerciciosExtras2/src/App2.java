import Entities.Pass;
import Services.PassService;
import java.util.Scanner;


public class App2 {

    public static int menu(String name) {
        Scanner read = new Scanner(System.in);
        int opcion;
        
        System.out.println("Bienvenido " + name);
        
        do{
            System.out.println("Ingrese una opcion");
            System.out.print("1.Cambiar Nombre\n2.Cambiar DNI\n3.Cambiar password\n4.Salir");
            opcion =read.nextInt();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public static void manipulatePass() {
        boolean exit = false;
        int opcion;
        Scanner read = new Scanner(System.in);
        PassService operatePass = new PassService();
        Pass thisPass = operatePass.createPass("Gonzalo Garcia", 24686878);
        
        System.out.println(thisPass);
        do{
            opcion = menu(thisPass.getNombre());
            switch (opcion){
                case 1:
                    operatePass.changeName(thisPass);
                    break;
                case 2:
                    operatePass.changeDni(thisPass);
                    break;
                case 3:
                    operatePass.changePass(thisPass);
                    break;
                case 4:
                    exit = true;
                    break;
            }

        } while (!exit);
        
    }

    public static void main(String[] args) {
        
        manipulatePass();
    }
    
}
