package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to63then2dot23() {
        double expected = 2.23;
        int x1 = 4;
        int y1 = 2;
        int x2 = 6;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when78to27then5dot09() {
        double expected = 5.09;
        int x1 = 7;
        int y1 = 8;
        int x2 = 2;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when165to126then4dot12() {
        double expected = 4.12;
        int x1 = 16;
        int y1 = 5;
        int x2 = 12;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
