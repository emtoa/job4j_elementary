package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x =  x2 - x1;
        int y =  y2 - y1;

        double xPow = Math.pow(x, 2);
        double yPow = Math.pow(y, 2);

        double rsl = Math.sqrt(xPow+yPow);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        result = Point.distance(0, 0, 5, 5);
        System.out.println("result (0, 0) to (5, 5) " + result);

        result = Point.distance(1, 2, 5, 5);
        System.out.println("result (1, 2) to (5, 5) " + result);
    }
}
