package second;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by agroshev on 16.06.2016.
 */
public class PointTest {

    @Test

    public void testDistance() {

        double x =0;
        double y =1;

        Point s = new Point(x, y);
        Assert.assertEquals(s.distance(new Point(0, 0)), 1.0);
    }
}
