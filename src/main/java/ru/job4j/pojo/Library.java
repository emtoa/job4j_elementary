package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book it = new Book("It",557);
        Book outsider = new Book("Outsider",351);
        Book fog = new Book("Fog",561);
        Book clean = new Book("Clean code", 764);

        Book[] book = new Book[4];

        book[0] = it;
        book[1] = outsider;
        book[2] = fog;
        book[3] = clean;

        for (int index = 0; index < book.length; index++){
            Book bk = book[index];
            System.out.println(bk.getName()+" - "+bk.getCount());
        }

        Book temp;
        temp = book[0];
        book[0] = book[3];
        book[3] = temp;

        for (int index = 0; index < book.length; index++){
            Book bk = book[index];
            System.out.println(bk.getName()+" - "+bk.getCount());
        }

        for (int index = 0; index < book.length; index++){
            Book bk = book[index];
            if (bk.getName().equals("Clean code"))
            System.out.println(bk.getName()+" - "+bk.getCount());
        }
    }
}