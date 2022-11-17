package view;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import model.GameBoard;

public class DrawArea extends JPanel {
    GameBoard board;
    int tileSize;

    public DrawArea(GameBoard board, int tileSize) {
        this.board = board;
        this.tileSize = tileSize;
    }

    @Override
    protected void paintComponent(Graphics grphcs){
        super.paintComponent(grphcs);

        Graphics2D g2 = (Graphics2D) grphcs;

        for(int i = 0; i<90; ++i){
            for(int k = 0; k<90; ++k){
               board.getBoard()[i][k].draw(g2, i, k, tileSize); 
            }
        }
        
    }

}
