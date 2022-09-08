package Services;
import Entities.Point;
import java.util.Scanner;

public class Point_service {
    
    public Point_service() {
    }

    public Point createPoint() {
        /*
         * Return a Point object
         */
        Scanner read = new Scanner(System.in);
        int x, y;
        Point thisPoint;
        System.out.print("Ingrese x:");
        x = read.nextInt();
        System.out.println("");
        System.out.print("Ingrese y:");
        y = read.nextInt();

        return thisPoint = new Point(x,y);        
    }

    public double distance(Point point1, Point point2) {
        /*
         * Return the distance between two points
         */
        return Math.sqrt(Math.pow(point2.getX()-point1.getX(), 2) + Math.pow(point2.getY()-point1.getY(),2));
    }
    public void movePoint(Point point, int x, int y) {
        point.setX(x);
        point.setY(y);
    }
}
