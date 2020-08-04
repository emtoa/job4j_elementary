package main.java.domino;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class DominoGameTest {

    @Test
    public void whenDominoIsWin() {

        DominoGame dGame = new DominoGame();

        dGame.addDomino(new Domino(3,4));
        dGame.addDomino(new Domino(3,3));
        dGame.addDomino(new Domino(1,2));
        dGame.addDomino(new Domino(3,2));

        dGame.Run();

        assertThat(dGame.toString(), is("[4 3] [3 3] [3 2] [2 1] "));
        assertThat(dGame.isVinner(), is(true));
    }

    @Test
    public void whenDominoIsNotWin() {

        DominoGame dGame = new DominoGame();

        dGame.addDomino(new Domino(3,4));
        dGame.addDomino(new Domino(3,3));
        dGame.addDomino(new Domino(3,1));
        dGame.addDomino(new Domino(3,2));

        dGame.Run();

        assertThat(dGame.toString(), is(""));
        assertThat(dGame.isVinner(), is(false));
    }
}