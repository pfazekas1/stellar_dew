package model.terrain;

import java.awt.Graphics2D;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Buildings extends GroundType{
    private final int number;

    public Buildings(int numbers){
        super();
        number = numbers;
        getFieldImage(number);
        type = "building";
    }

    private void getFieldImage(int number) {
        try {
            building = setImage("build/"+ number +".png");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics2D g2, int i, int k, int tileSize) {
        BufferedImage image = null;
        image = building;
        g2.drawImage(image, i*tileSize, k*tileSize, tileSize, tileSize, null); 

    }
    
}
