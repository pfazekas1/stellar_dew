package model.terrain;

import java.awt.Graphics2D;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Grass extends GroundType {
    private final int number;
    
    public Grass(int numbers){
        super();
        number = numbers;
        getFieldImage(number);
        type = "grass";
    }

    private void getFieldImage(int number) {
        try {
            switch (number) {
                case 16:
                    grass = setImage("grass.png");
                    break;
                case 5:
                    grass = setImage("bush1.png");;
                    break;
                case 6:
                    grass = setImage("pink_flowerbush.png");
                    break;
                case 7:
                    grass = setImage("bush2.png");
                    break;
                case 20:
                    grass = setImage("trunk.png");;
                    break;
                case 21:
                    grass = setImage("white_flowerbush.png");
                    break;
                case 22:
                    grass = setImage("pink_flower1.png");
                    break;
            }
            
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
