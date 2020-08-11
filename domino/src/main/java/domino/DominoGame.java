package main.java.domino;

import java.util.Arrays;

public class DominoGame {

    private final int max_size = 4*2;
    private Domino dominos[];
    private SteckX theSteckX;
    private int l = -1;

    public DominoGame() {
        theSteckX = new SteckX();
        this.dominos = new Domino[max_size];
    }

    public void addDomino(Domino domino) {
        ++l;
        int fIndx = l;
        this.dominos[fIndx] = new Domino(domino.getFirst(), domino.getEnd(), fIndx);
        this.dominos[++l] = new Domino(domino.getEnd(), domino.getFirst(), fIndx);
    }

    public void displayDomino(int l) {
        System.out.println("["+this.dominos[l].getFirst()+" "+this.dominos[l].getEnd()+"]");
    }

    public int getFound(Domino domino) {

        for (int i = 0; i < max_size; i++) {
            if (domino.getEnd() == this.dominos[i].getFirst() && this.dominos[i].isVisited() == false && domino.getNum() != this.dominos[i].getNum()) {
                return i;
            }
        }
        return -1;
    }

    public SteckX getSteck() {
        return theSteckX;
    }

    public boolean isVinner() {
        return ((Arrays.stream(theSteckX.getSt())
                .filter(f -> f == null)
                .count()) == 0);
    }

    public void visited(int id, boolean isTrue) {
        this.dominos[id].setVisited(isTrue);
    }

    public void Run() {

        int t = 0;
        int r = 0;

        while (r < max_size / 2 && t < max_size) {
            visited(t, true);
            //displayDomino(t);
            theSteckX.push(this.dominos[t]);

            while (!theSteckX.isEmpty()) {
                int id = getFound(theSteckX.peek());

                if (id == -1) {
                    theSteckX.pop();
                } else {
                    r++;
                    visited(id, true);
                    //displayDomino(id);
                    theSteckX.push(this.dominos[id]);
                }
            }
            t++;
        }
    }

    @Override
    public String toString() {
        String result = "";
        if (!this.getSteck().isEmpty()) {
            for (Domino dmn : this.getSteck().getSt()) {
                result += "[" + dmn.getFirst() + " " + dmn.getEnd() + "] ";
            }
        }
        return result;
    }

}
