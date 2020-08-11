package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];

        names[0] = "Petr Arsentev";
        names[1] = "Pavel Bure";
        names[2] = "Lev Yashin";
        names[3] = "Igor Akinfeev";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
