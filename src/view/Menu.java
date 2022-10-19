package view;

import constants.Constants;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {
    //private Timer timer;

    public Menu() {
        setPreferredSize(new Dimension());
        setBackground(Constants.BACKGROUND_COLOR);
        setFocusable(true);

        newGame();//method is called here strictly for testing purposes
    }

    public void newGame() {
        String name = JOptionPane.showInputDialog(null, "Please enter your character's name!");
        if(name == null || name.trim().length() == 0){
            name = "John Doe";
        }
    }

    public void drawStartScreen(Graphics2D g2d){
        g2d.setFont(Constants.MAIN_FONT);
        g2d.setColor(Constants.TEXT_COLOR);
        g2d.drawString("Valley of Stellar Dew", Constants.TITLE_POS_X, Constants.TITLE_POS_Y);
    }


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);

        drawStartScreen(g2d);
    }

    private class MyButton extends JButton{
        public MyButton(){
//todo
        }
    }
}
