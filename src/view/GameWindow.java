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
        //getContentPane().add(menu, BorderLayout.PAGE_START);
        //will use different layout this is just for testing purposes while I figure out where I should efficiently store all these variables outside the constructor
        setLocationRelativeTo(null);
        JButton startNewGame = new JButton("New game");
        JButton loadGame = new JButton("Load game");
        JLabel title = new JLabel("Valley of Stellar Dew", SwingConstants.CENTER);
        getContentPane().add(title, BorderLayout.CENTER);
        getContentPane().add(startNewGame, BorderLayout.PAGE_START);
        getContentPane().add(loadGame, BorderLayout.PAGE_END);
        //pack();
    }



    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new GameWindow().setVisible(true));
    }
}
