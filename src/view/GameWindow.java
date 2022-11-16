package view;

import model.GameBoard;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class GameWindow extends JFrame {
    private final GameBoard gameBoard = new GameBoard(90, 90);
    DrawArea drawArea;
    int drawAreaX = 2880;
	int drawAreaY = 2880; 
    int frameX = 2880;
	int frameY = 2880;
    private JFrame frame;


    public GameWindow() {
        setTitle("Stellar Dew Valley");
        setSize(2880, 2880); //90 * 90 cells, because each cell is 32 * 32.
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        drawArea = new DrawArea(gameBoard, 32);
        drawArea.setMaximumSize(new Dimension(drawAreaY, drawAreaX));

        JScrollPane scroll = new JScrollPane(drawArea);

        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(scroll);
        frame.setPreferredSize(new Dimension(frameX, frameY));
        drawArea.setPreferredSize(new Dimension(drawAreaY, drawAreaX));

        frame.pack();
		frame.setVisible(true);
        setVisible(false);
    }

    public static void main(String[] args){
        GameWindow window = new GameWindow();
    }
}
