import Entidades.*;
import Services.*;
import java.util.Scanner;

public class App {

    public static void ejercicio7() {

        Persona [] personas = new Persona[4];
        double mayoresEdad=0, bajoPeso=0, enPeso=0, sobrePeso =0;
        
        for (int i=0; i<4; i++){
            personas[i] = Persona.crearPersona();     
            System.out.println("------------------------");       
        }
        
        for (int j=0; j<4;j++){
            System.out.print(personas[j].getNombre()+": ");
            
            if (personas[j].mayorEdad()) {
                System.out.print("Es mayor de edad, y ");
                mayoresEdad++;
            } else {
                System.out.print("Es menor de edad, y ");
            }

            switch (personas[j].imcValue()){
                case -1:
                    System.out.println("esta por debajo de su peso ideal");
                    bajoPeso++;
                    break;
                case 0:
                    System.out.println("esta en su peso ideal");
                    enPeso++;
                    break;
                case 1:
                    System.out.println("esta por encima de su peso ideal");
                    sobrePeso++;
                    break;
            }    
        }
        System.out.println("Hay un "+ ((mayoresEdad/4)*100) +"% mayores de edad y un "+ ((1-(mayoresEdad/4))*100)+"% de menores de edad");
        System.out.println("Hay "+((bajoPeso/4)*100)+"% por debajo de su peso");
        System.out.println("Hay "+((enPeso/4)*100)+"% en de su peso");
        System.out.println("Hay "+((sobrePeso/4)*100)+"% por encima de su peso");
    }
    
    public static void ejercicio8() {
        Scanner read = new Scanner(System.in);
        
        Cadena frase = OperarCadena.crearCadena();
        OperarCadena.mostrarVocales(frase);
        OperarCadena.invertirFrase(frase);
        OperarCadena.vecesRepetido(frase);
        for (int i=0; i<3;i++){
            System.out.println("Ingrese la frase para comparar longitud:");
            System.out.println(OperarCadena.compararLongitud(frase, read.nextLine()));           
        }
        System.out.println("Ingrese la frase a unir");
        OperarCadena.unirFrases(frase, read.nextLine());
        OperarCadena.reemplazarA(frase, "@");
        for (int i=0; i<3; i++){
            System.out.println("Ingrese la letra a buscar: ");
            System.out.println(OperarCadena.contieneLetra(frase, read.nextLine()));
            
        }


        

    }
    public static void main(String[] args) throws Exception {
        
        ArraysEj09 arrayEj = new ArraysEj09();
        arrayEj.sortArray();
        arrayEj.copyArrayToB();
        
        //ejercicio8();
                
        //ejercicio7();   //Persona
        
        /*nesspreso miCafetera = new nesspreso(0);
        serviceNesspreso.operarCafetera(miCafetera); */
             
        /*Cuenta miCuenta = new Cuenta();
        OperarCuenta.creaCuenta(miCuenta);
        OperarCuenta.operar(miCuenta); */

        /*Circunferencia circ = new Circunferencia(4.55);
        Circunferencia circ2;

        circ2 = new Circunferencia(1.99996);

        System.out.println(circ.getRadio());
        System.out.println(circ2.getRadio());

        circ.crearCircunferencia();
        circ.area();
        circ.perimetro();
        circ.showCircle(); */

        /*Operacion op = new Operacion();

        op.crearOperacion();

        System.out.println(op.sumar());
        System.out.println(op.restar());
        System.out.println(op.multiplicar());
        System.out.println(op.dividir());  */

        
        /*Rectangulo rec = new Rectangulo();

        rec.crearRectangulo();
        rec.calcularPerimetro();
        rec.calcularSuperficie();
        rec.show();
        rec.dibujar();  */

    }
}
