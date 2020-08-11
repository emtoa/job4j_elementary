package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int first = 0;
        int second = 0;
        int third = 0;

        while (third < rsl.length)
        {
            if (first < left.length && second < right.length) {
                if (left[first] <= right[second]) {
                    rsl[third] = left[first];
                    first++;
                } else if (right[second] < left[first]) {
                    rsl[third] = right[second];
                    second++;
                }
            } else if (second <= right.length && (first >= left.length || left.length == 0)) {
                rsl[third] = right[second];
                second++;
            } else if (first <= left.length && (second >= right.length || right.length == 0)) {
                rsl[third] = left[first];
                first++;
            }
        third++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}