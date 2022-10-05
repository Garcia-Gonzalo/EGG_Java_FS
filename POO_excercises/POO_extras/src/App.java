import Entities.*;
import Services.*;

public class App {

    public static void extra2() {
        Point p1,p2;
        Point_service pointControl = new Point_service();
        p1 = pointControl.createPoint();
        p2 = pointControl.createPoint();
        System.out.println("La distancia es: "+pointControl.distance(p1, p2));
        
    }

    public static void extra3() {
        Raices roots = new Raices();
        roots.calculateRoots();
    }

    public static void extra4() {
        Dni mDni = new Dni();
        System.out.println(mDni);
        
    }

    public static void extra6() {
        AhorcadoService thisGame = new AhorcadoService();
        Ahorcado word = thisGame.createAhorcado();
        
        thisGame.menuGame(word);
        
        
    }

    
    
    public static void main(String[] args) throws Exception {
        //extra2();
        //extra3();
        //extra4();
        extra6();
        
        
    }
}
