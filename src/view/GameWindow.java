package view;

import model.GameBoard;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
    private final GameBoard gameBoard = new GameBoard(50, 25);

    public GameWindow() {
        setTitle("Stellar Dew Valley");
        setSize(1600, 800); //50 * 25 cells, because each cell is 32 * 32.
        setVisible(true);setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        GameWindow window = new GameWindow();
    }
}
