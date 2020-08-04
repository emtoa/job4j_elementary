package main.java.domino;

public class SteckX {
    private final int size = 4;
    private Domino[] st;
    private int top;

    public SteckX() {
        st = new Domino[size];
        top = -1;
    }

    //Добавляем домино в стек
    public void push(Domino domino) {
        st[++top] = domino;
    }

    //Извлекаем домино из стека
    public Domino pop() {
        return st[top--];
    }

    //Читаем последнее домино из стека
    public Domino peek() {
        return st[top];
    }

    //проверяем постой стек или нет
    public boolean isEmpty() {
        return (top == -1);
    }

    public Domino[] getSt() {
        return st;
    }
}
