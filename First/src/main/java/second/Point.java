package second;

/**
 * Created by agroshev on 30.05.2016.
 */
public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance (Point p2){
        double x_sqr = Math.pow(this.x + p2.x, 2);
        double y_sqr = Math.pow(this.y + p2.y, 2);

        return Math.sqrt(x_sqr+ y_sqr);
    }

}
