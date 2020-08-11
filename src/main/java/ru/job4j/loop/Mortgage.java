package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double inAmount = amount;
        while (inAmount > 0) {
            inAmount = inAmount+(inAmount * percent)/100;
            inAmount = inAmount - salary;
            year++;
        }
        return year;
    }
}