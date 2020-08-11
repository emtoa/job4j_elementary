package ru.job4j.encapsulation;

public class ATM {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addMoney(100);
        acc.addMoney(30);

        System.out.println(acc.getBalance());
    }
}
