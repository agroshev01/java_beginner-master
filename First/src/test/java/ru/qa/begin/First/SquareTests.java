package ru.qa.begin.First;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by agroshev on 01.06.2016.
 */

public class SquareTests {

    @Test
    public void testArea() {

        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }
}
