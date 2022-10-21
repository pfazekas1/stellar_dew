package view;

import model.GameBoard;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
    private final GameBoard gameBoard = new GameBoard(30, 30);
    DrawArea drawArea;
    int drawAreaX = 1600;
	int drawAreaY = 800; 
    int frameX = 1600;
	int frameY = 800;
    private JFrame frame;


    public GameWindow() {
        setTitle("Stellar Dew Valley");
        setSize(1600, 800); //50 * 25 cells, because each cell is 32 * 32.
        setVisible(true);setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        drawArea = new DrawArea(gameBoard, 32);
        drawArea.setMaximumSize(new Dimension(drawAreaY, drawAreaX));
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(drawArea);
        frame.setPreferredSize(new Dimension(frameX, frameY));
        drawArea.setPreferredSize(new Dimension(drawAreaY, drawAreaX));

        frame.pack();
		frame.setVisible(true);
    }

    public static void main(String[] args){
        GameWindow window = new GameWindow();
    }
}
