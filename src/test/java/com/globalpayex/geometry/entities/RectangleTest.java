package com.globalpayex.geometry.entities;

import com.abc.geometry.ShapeStatistics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea(){
        var r1 = new Rectangle(4,2);
        var expected = 8;
        var actual = r1.area();
        assertEquals(expected,actual);
    }

    @Test
    void testPerimeter(){
        var r1 = new Rectangle(4,2);
        var expected = 12;
        var actual = r1.perimeter();
        assertEquals(expected,actual);
    }

    @Test
    void testShapeStatistic(){
        String expected = "***\nArea is 16\nPerimeter is 16\n***";
        var r1 = new Square(4);
        var actual = ShapeStatistics.calculate(r1);
        assertEquals(expected, actual);

//        var s = new Shape(); cannot create an object of abstract class


    }


}