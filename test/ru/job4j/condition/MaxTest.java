package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));

        result = Max.max(6, 1);
        assertThat(result, is(6));

        result = Max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2To3Then3() {
        int result = Max.max(1,4,7);
        assertThat(result, is(7));

        result = Max.max(6,3,2);
        assertThat(result, is(6));

        result = Max.max(4,8,1);
        assertThat(result, is(8));

        result = Max.max(8,8,1);
        assertThat(result, is(8));

        result = Max.max(8,8,8);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax2To4Then4() {
        int result = Max.max(1,4,7, 9);
        assertThat(result, is(9));

        result = Max.max(6,3,2, 1);
        assertThat(result, is(6));

        result = Max.max(4,8,1, 7);
        assertThat(result, is(8));

        result = Max.max(4,8,11, 7);
        assertThat(result, is(11));


        result = Max.max(8,8,1,8);
        assertThat(result, is(8));

        result = Max.max(8,8,8,8);
        assertThat(result, is(8));
    }
}