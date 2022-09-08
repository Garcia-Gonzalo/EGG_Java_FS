package Services;

import Entities.CheckDateInput;
import java.util.Scanner;
import java.time.LocalDate;
/*
 * Validate date input
 */
public class CheckDateInput_Service {
    
    public static LocalDate createFecha() {
        // Return LocalDate object

        Scanner read = new Scanner(System.in);
        int inputNumber;

        // usamos la clase CheckDateInput que funciona como un registro de datos
        CheckDateInput [] check = new CheckDateInput[3];
        check[0]= CheckDateInput.createCheck("Ingrese el año", 1900, 2022);
        check[1]= CheckDateInput.createCheck("Ingrese el mes", 1, 12);
        check[2]= CheckDateInput.createCheck("Ingrese el dia", 1, 31);
        
        // Validating input numbers
        do{
            for (int i=0; i<3;i++){
                while (!check[i].isChecked()){
                    System.out.println(check[i].getMessage());
                    inputNumber = read.nextInt();
                    if (inputNumber>=check[i].getMin() && inputNumber <= check[i].getMax()){
                        check[i].setValue(inputNumber);
                        check[i].setChecked(true);
                    }
                }
            }
        } while (!(check[0].isChecked() && check[1].isChecked() && check[2].isChecked()));

        return LocalDate.of(check[0].getValue(),check[1].getValue(),check[2].getValue());
    }
    
}
