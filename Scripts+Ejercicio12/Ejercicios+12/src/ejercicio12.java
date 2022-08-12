import java.util.Scanner;
/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
public class ejercicio12 {
    
    public static int evaluateInput(String inputRS) {
        // Evalúa el input y retorna 0 si es error, 1 si es correcto y -1 si es el codigo de finalizado
        if (inputRS.length() == 5){
            if (inputRS.equals("&&&&&")){
                return -1;
            } else { if (inputRS.substring(0,1).equals("X") && inputRS.substring(4,5).equals("O")){
                    return 1;
                    } else {
                        return 0;    
                }
            }
        } else{
            return 0;
        }
    }

    public static void ejer12() {
        String rs232In;
        int correct=0;
        int counter=0;
        int evaluate;
        boolean endCycle=false;
        Scanner keyIn = new Scanner(System.in);

        System.out.println("Ingrese los codigos(5caracteres");
        System.out.println("Ingrese &&&&% para finalizar");
                       
        while (!endCycle){
            rs232In = keyIn.nextLine();    
            //keyIn.nextLine();
            evaluate =evaluateInput(rs232In);
            System.out.println(evaluate);
            if (evaluate >= 0){
                counter += 1;
                correct += evaluate;
            } else {
                endCycle=true;
            }
        }
        System.out.println("Ingresos correctos: " + correct);
        System.out.println("Ingresos incorrectos: " + (counter-correct));
    }
}