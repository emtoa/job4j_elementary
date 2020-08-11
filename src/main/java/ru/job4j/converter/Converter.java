package ru.job4j.converter;

/** Класс для конвертации рублей в валюту: доллары и евро.
 * @author Alexander Khachaturov
 * @version 1.0
 */
public class Converter {
    /**
     * Функция конвертирует рубли в евро
     * @param value - сумма в рублях
     * @return сумма в евро
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70; /* формула перевода рублей в евро. */
        return rsl;
    }

    /**
     * Функция конвертирует рубли в доллары
     * @param value - сумма в рублях
     * @return сумма в долларах
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллоры. */
        return rsl;
    }

    /**
     * Метод позволяет вызывать рабочий код программы и выводить результат
     * @param args
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar  = Converter.rubleToDollar(120);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
         in = 120;
         expected = 2;
         out = rubleToDollar(in);
         passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
    }
}