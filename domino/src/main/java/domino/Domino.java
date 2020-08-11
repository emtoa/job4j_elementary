package main.java.domino;

public class Domino {

    private int first;
    private int end;
    private int num;
    private boolean isVisited;

    public Domino(int first, int end) {
        this.first = first;
        this.end = end;
        this.isVisited = false;
    }
    public Domino(int first, int end, int num) {
        this.first = first;
        this.end = end;
        this.num = num;
        this.isVisited = false;
    }

    public int getFirst() {
        return first;
    }


    public int getEnd() {
        return end;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
