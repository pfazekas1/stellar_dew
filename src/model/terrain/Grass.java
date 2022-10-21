package model.terrain;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Grass extends GroundType {

    public Grass(){
        super();
        getFieldImage();
    }

    private void getFieldImage() {
        try {
            grass = setImage("grass.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics2D g2, int i, int k, int tileSize) {
        BufferedImage image = null;
        image = grass;
        g2.drawImage(image, i*tileSize, k*tileSize, tileSize, tileSize, null); 
        g2.setColor(Color.black);
		g2.drawLine(0,100,90,100);
    }
    
}
