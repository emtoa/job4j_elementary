package ru.job4j.condition;

        import org.junit.Assert;
        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class TrgAreaTest {
    @Test
    public void whenTriangleArea2() {
        Point a = new Point(0,0);
        Point b = new Point(2,0);
        Point c = new Point(0,2);

        TrgArea trg = new TrgArea(a, b, c);
        double out = trg.area();
        double expected = 1.99;
        Assert.assertEquals(expected, out, 0.01);
    }
}