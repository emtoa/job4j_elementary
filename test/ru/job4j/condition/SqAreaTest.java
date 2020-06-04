package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenSquareOneReal() {
        double out = SqArea.square(4, 1);
        double expected = 1.0;
        Assert.assertEquals(expected, out, 0.01);
    }
}