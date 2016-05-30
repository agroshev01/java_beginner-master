package ru.qa.begin.First;

/**
 * Created by agroshev on 30.05.2016.
 */
public class Distance {



    public static void main (String[] args){

        Point p1 = new Point();
        p1.x = 4;
        p1.y = 5;

        Point p2 = new Point();
        p1.x = 1;
        p1.y = 2;

        double result = distance(p1, p2);
        System.out.println("distance between two points " + result);
        System.out.println(" " );

        Point_1 t1 = new Point_1();
        Point_1 t2 = new Point_1();
        t2.x = 2;
        t2.y = 2;
        System.out.println("distance between 2 points(counted via method)" + t1.distance_1(t2));

    }

    public static double distance (Point p1, Point p2){
        double x_sqr = Math.pow(p1.x + p2.x, 2);
        double y_sqr = Math.pow(p1.y + p2.y, 2);

        return Math.sqrt(x_sqr+ y_sqr);
    }

}
