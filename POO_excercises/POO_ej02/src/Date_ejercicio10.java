import java.util.Scanner;
import java.util.Date;
import Entidades.CheckDate;

public class Date_ejercicio10 {

    public static Date createFecha() {
        Scanner read = new Scanner(System.in);
        int inputNumber;
        // usamos la clase CheckDate que funciona como un registro de datos
        CheckDate [] check = new CheckDate[3];
        check[0]= CheckDate.createCheck("Ingrese el año", 1970, 2022,1900);
        check[1]= CheckDate.createCheck("Ingrese el mes", 1, 12,1);
        check[2]= CheckDate.createCheck("Ingrese el dia", 1, 31,1);
        // Validating input numbers
        do{
            for (int i=0; i<3;i++){
                while (!check[i].isChecked()){
                    System.out.println(check[i].getMessage());
                    inputNumber = read.nextInt();
                    if (inputNumber>=check[i].getMin() && inputNumber <= check[i].getMax()){
                        check[i].setValue(inputNumber -  check[i].getCorrect());
                        check[i].setChecked(true);
                    }
                }
            }
        } while (!(check[0].isChecked() && check[1].isChecked() && check[2].isChecked()));

        for (int j=0; j<3; j++){
            System.out.println(check[j].getValue());
        }
        Date fecha = new Date(check[0].getValue(),check[1].getValue(),check[2].getValue());
        return fecha;
    }
    

    public static void main(String[] args) {
        Date fecha = createFecha();
        Date fechaActual = new Date();

        System.out.println("Hay " + (Math.abs((double)(fecha.getYear()-fechaActual.getYear())))+ " años entre ambas fechas");

    }
}
