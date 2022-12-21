package view;

import model.GameBoard;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class GameWindow extends JFrame {
    private final GameBoard gameBoard = new GameBoard(90, 90);
    DrawArea drawArea;
    int drawAreaX = 2880;
	int drawAreaY = 2880; 
    int frameX = 2880;
	int frameY = 2880;
    private JFrame frame;
    private JFrame window;
    static java.awt.Dimension bd;

    public GameWindow() {
        setTitle("Stellar Dew Valley");
        setSize(2880, 2880); //90 * 90 cells, because each cell is 32 * 32.
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        drawArea = new DrawArea(gameBoard, 32);
        drawArea.setMaximumSize(new Dimension(drawAreaY, drawAreaX));

        JScrollPane scroll = new JScrollPane(drawArea);

        // Initial window
        window = new JFrame();
        window.setSize(1200, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Button to initialize everything
        JButton start_button = new JButton("Start Game");
        JButton exit_button = new JButton("Exit Game");
        bd = (start_button.getPreferredSize());


        // Take out the border around the text
        start_button.setFocusable(false);        


        // Panel to hold our buttons
        java.awt.Dimension d = window.getSize();
        JPanel start_panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, d.height / 2 - bd.height / 2));
        

        start_panel.add(start_button);
        start_panel.add(exit_button);

        

        window.add(start_panel);  
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        start_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                window.setVisible(false);
                frame.setVisible(true);
            }
        });

        exit_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               frame.dispose();
               window.dispose();
            }
         });


        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(scroll);
        frame.setPreferredSize(new Dimension(frameX, frameY));
        drawArea.setPreferredSize(new Dimension(drawAreaY, drawAreaX));

        frame.pack();
		frame.setVisible(false);
        setVisible(false);
    }

    public static void main(String[] args){
        GameWindow window = new GameWindow();
    }
}
