package ru.job4j.encapsulation;

public class Account {
    private int Balance;

    public void addMoney(int money){
        this.Balance += money;
    }

    public int getBalance (){
        return this.Balance;
    }
}
