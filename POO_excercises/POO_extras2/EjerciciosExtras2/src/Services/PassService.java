package Services;
import Entities.Pass;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.BlockElement;

public class PassService {
    
    public PassService() {
    }

    public Pass createPass(String name, int dni) {
        Pass tempPass = new Pass(name, dni);
        System.out.println("Su contraseña es de nivel "+analizarPass(tempPass.getPass()));
        return tempPass;
    }
    
    public String analizarPass(String pass) {
        String result = "BAJO";
        int index;

        if (pass.contains("z")){
            result = "MEDIO";
            index = pass.indexOf("a");
            if (index != -1){
                index = pass.indexOf("a", index+1);
                if (index != -1) result = "ALTO";
            }
        }
        return result;        
    }

    private boolean checkPass(String thisPass, String passToCheck) {
        return passToCheck.equals(thisPass);
    }

    public void changeName(Pass thisPass) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el password: ");
        if (checkPass(thisPass.getPass(), read.nextLine())){
            System.out.print("Ingrese el nombre: ");
            thisPass.setNombre(read.nextLine());
            System.out.println("El nombre se cambio correctamente");
            System.out.println(thisPass);
        } else System.out.println("Password incorrecto");   
    }
    public void changeDni(Pass thisPass) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese el password: ");
        if (checkPass(thisPass.getPass(), read.nextLine())){
            System.out.print("Ingrese el DNI: ");
            thisPass.setDni(read.nextInt());
            System.out.println("El DNI se cambio correctamente");
            System.out.println(thisPass);
        } else System.out.println("Password incorrecto");   
    }

    public void changePass(Pass thisPass) {
        Scanner read = new Scanner(System.in);
        String temporaryPass;

        System.out.print("Ingrese el password: ");
        if (checkPass(thisPass.getPass(), read.nextLine())){
            System.out.print("Ingrese el nuevo password: ");
            temporaryPass = read.nextLine();
            System.out.print("Confirme el nuevo password: ");
            if (temporaryPass.equals(read.nextLine())){
                thisPass.setPass(temporaryPass);
                System.out.println("El password se ha cambiado exitosamente");
                System.out.println("Su contraseña es de nivel " +  analizarPass(thisPass.getPass()));
            } else System.out.println("No se pudo confirmar el nuevo password");
        } else System.out.println("Password incorrecto");
        
    }

    /******************************************************************************************
    ************************ Test methods */
    public void testAnalizarPass() {
        System.out.print("parrilla = BAJO");
        System.out.println(analizarPass("parrilla"));
        System.out.print("zorra = MEDIO");
        System.out.println(analizarPass("arroz"));
        System.out.print("zapallo = ALTO");
        System.out.println(analizarPass("zapallo"));        
    }

    public static void main(String[] args) {
        PassService testService = new PassService();
        testService.testAnalizarPass();

        Pass testPass;
        testPass = testService.createPass("Gonzalo", 24686878);
        System.out.println(testPass);
        System.out.println(testPass.getPass());

        testService.changeName(testPass);
        testService.changeDni(testPass);
        testService.changePass(testPass);
        
    }

}
