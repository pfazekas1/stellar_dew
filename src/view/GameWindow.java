package view;

import constants.Constants;
import model.GameBoard;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame{
    private final GameBoard gameBoard = new GameBoard();
    private final Menu menu = new Menu();

    public GameWindow() {
        setTitle("Valley of Stellar Dew");
        setSize(Constants.GAME_WIDTH, Constants.GAME_HEIGHT);
        setVisible(true);setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().add(menu, BorderLayout.CENTER);
        //pack();
        setLocationRelativeTo(null);
    }



    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new GameWindow().setVisible(true));
    }
}
