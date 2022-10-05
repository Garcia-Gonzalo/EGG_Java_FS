/*
 * Implements aritmethics operations on Fraccion object.
 */
package Services;
import Entities.Fraccion;
import java.util.Scanner;

public class FraccionService {

    public static Fraccion multiplica(Fraccion f1, Fraccion f2) {
        Fraccion result;
        if (f1.getNum()==0 || f2.getNum()==0) result = new Fraccion(0);
        else{
            result = new Fraccion((f1.getNum()*f2.getNum()),(f1.getDen()*f2.getDen()));
        }
        result.reduce();
        return result;
    }

    public static Fraccion divide(Fraccion f1, Fraccion f2) {
        Fraccion result;
        if (f2.getNum()==0){
            System.out.println("No se puede dividir por 0");
            result = new Fraccion(0);
        } else result = new Fraccion((f1.getNum()*f2.getDen()),(f1.getDen()*f2.getNum()));
        result.reduce();
        return result;
    }

    private static Fraccion noZero(Fraccion f1, Fraccion f2){
        if (f1.getNum()==0) return new Fraccion(f1.getNum(),f1.getDen());
        else return new Fraccion(f2.getNum(),f2.getDen());
    }

    public static Fraccion suma(Fraccion f1, Fraccion f2) {
        Fraccion result;
        int common;
        if (f1.getNum()==0 || f2.getNum()==0){
            result = noZero(f1,f2);
        } else{
            common = f1.getDen()*f2.getDen();
            result = new Fraccion((((common/f1.getDen())*f1.getNum())+((common/f2.getDen())*f2.getNum())),common);
        }
        result.reduce();
        return result;
    }

    public static Fraccion resta(Fraccion f1, Fraccion f2) {
        Fraccion result;
        int common;
        if (f1.getNum()==0 || f2.getNum()==0){
            result = noZero(f1,f2);
        } else{
            common = f1.getDen()*f2.getDen();
            result = new Fraccion((((common/f1.getDen())*f1.getNum())-((common/f2.getDen())*f2.getNum())),common);
        }
        result.reduce();
        return result;
    }

    // for testing
    public static void main(String[] args) {
        Fraccion f1,f2;
        for (int i=0; i<3; i++){
            f1 = new Fraccion();
            f2 = new Fraccion();
            //System.out.println(multiplica(f1, f2));
            System.out.println(divide(f1, f2));
            //System.out.println(suma(f1, f2));
            //System.out.println(resta(f1, f2));
        }
    }
    
    
}
