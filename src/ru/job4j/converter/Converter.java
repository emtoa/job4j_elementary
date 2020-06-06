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
        int euro = Converter.rubleToEuro(140);                 /*Проиводим конвертацию 140 рублей в евро*/
        int dollar  = Converter.rubleToDollar(120);            /*Проиводим конвертацию 120 рублей в доллары*/
        System.out.println("140 rubles are " + euro + " euro.");     /*Выводим результат конвертации 140 рублей в евро*/
        System.out.println("120 rubles are " + dollar + " dollar."); /*Выводим результат конвертации 120 рублей в доллары*/

        int in = 140;       /*Входящие данные*/
        int expected = 2;   /*Проверочные данные*/
        int out = rubleToEuro(in);  /*Проиводим конвертацию 140 рублей в евро*/
        boolean passed = expected == out; /*Проерка на правильность конвертации из рублей в евро, если конвертация правильно сработала то true, если нет то false*/

        System.out.println("140 rubles are 2. Test result : " + passed); /*Выводим результат конвертации 140 рублей в евро true или false*/

         in = 120;      /*Входящие данные*/
         expected = 2;  /*Проверочные данные*/
         out = rubleToDollar(in);   /*Проиводим конвертацию 120 рублей в доллары*/
         passed = expected == out;  /*Проерка на правильность конвертации из рублей в евро, если конвертация правильно сработала то true, если нет то false*/

        System.out.println("120 rubles are 2. Test result : " + passed); /*Выводим результат конвертации 120 рублей в доллары true или false*/
    }
}