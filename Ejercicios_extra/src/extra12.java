/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 */

import java.util.Scanner;

public class extra12 {
    public static String codedNUmber(int[] values) {
        String result="";
        int i;
        for (i=0; i<3;i++){
            
            if(values[i]==3){
                result = result + 'E';
            } else {
                result = result + String.valueOf(values[i]);
            }
            if (i<2){
               result = result +'-';
            }
        }
        return result;
    }
    public static boolean addOne(int [] number) {
        boolean complete = false;

        if (number[2]!=9){
            number[2] +=1;
            return complete;
        } else{
            if (number[1]!=9){
                number[2]=0;
                number[1]+=1;
                return complete;
            } else{
                if (number[0]!=9){
                    number[2]=0;
                    number[1]=0;
                    number[0]+=1;
                    return complete;
                } else {
                    complete=true;
                    return complete;
                }
            }
        }        
    }
    public static void ext12() {
        int [] number = {0,0,0};
        boolean full=false;
        do{
            System.out.print(codedNUmber(number)+", ");
            full = addOne(number);
        } while (!full);
        
    }
}
