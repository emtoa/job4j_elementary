package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        int rc;
        for (int row = 1; row <= height; row++) {
            rc = row % 2;
            for (int cell = 1; cell <= width; cell++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((cell % 2 == rc)) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}