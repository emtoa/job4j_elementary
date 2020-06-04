package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenmanWeightIsGood() {
        int in = 182;
        double out = Fit.manWeight(in);
        double expected = 94.3;

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanWeightIsGood() {
        int in = 165;
        double out = Fit.womanWeight(in);
        double expected = 63.24;

        Assert.assertEquals(expected, out, 0.01);
    }
}