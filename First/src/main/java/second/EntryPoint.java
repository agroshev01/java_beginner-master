package second;

/**
 * Created by agroshev on 30.05.2016.
 */
public class EntryPoint {

    public static void main (String[] args){

//        POINT P1 = NEW POINT();
//        P1.X = 4;
//        P1.Y = 5;
//
//        POINT P2 = NEW POINT();
//        P1.X = 1;
//        P1.Y = 2;
//
//        DOUBLE RESULT = DISTANCE(P1, P2);
//        SYSTEM.OUT.PRINTLN("DISTANCE BETWEEN TWO POINTS " + RESULT);
//
//
//        DOUBLE RESULT_1 = POINT_1.DISTANCE_1;
//        SYSTEM.OUT.PRINTLN("DISTANCE BETWEEN TWO POINTS " + RESULT_1);
        Point point = new Point(0,0);
        Point point2 = new Point(0,0);
        point2.x = 2;
        point2.y = 2;
//
        System.out.println("!" + distance(point, point2));
        System.out.println("!" + point.distance(point2));

    }

    public static double distance (Point p1, Point p2){
        double x_sqr = Math.pow(p1.x + p2.x, 2);
        double y_sqr = Math.pow(p1.y + p2.y, 2);

        return Math.sqrt(x_sqr+ y_sqr);
    }

}
