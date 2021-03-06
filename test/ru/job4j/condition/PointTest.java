package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenDistanceIsRight() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 2.0;

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance3dIsRight() {
        Point a = new Point(0, 0,0);
        Point b = new Point(0, 6,0);
        double out = a.distance(b);
        double expected = 6.0;

        Assert.assertEquals(expected, out, 0.01);
    }
}