package model.terrain;

import java.awt.Graphics2D;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Grass extends GroundType {

    public Grass(){
        getFieldImage();
    }

    private void getFieldImage() {
        try {
            grass = setImage("img/grass.png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics2D g2, int i, int k, int tileSize) {
        BufferedImage image = null;
        image = grass;
        g2.drawImage(image, i*tileSize, k*tileSize, tileSize, tileSize, null); 
        
    }
    
}
