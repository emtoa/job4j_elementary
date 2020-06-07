package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6Then2() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 6, 3, 4};
        int value = 6;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas4Then3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 6, 3, 4};
        int value = 4;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas2ThenNotFind() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 6, 3, 4};
        int value = 2;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind0() {
        int[] input = new int[] {5, 10, 6, 3, 4};
        int value = 5;
        int start = 0;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind() {
        int[] input = new int[] {8,6,8,6,2,11};
        int value = 3;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}