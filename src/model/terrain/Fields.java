package model.terrain;

import java.awt.Graphics2D;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Fields extends GroundType {
    private final int number;

    public Fields(int numbers) {
        super();
        number = numbers;
        getFieldImage(number);
        type = "field";
    }

    private void getFieldImage(int number) {
        try {
            switch (number) {
                case 34:
                    field = setImage("field.png");
                    break;
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics2D g2, int i, int k, int tileSize) {
        BufferedImage image = null;
        image = field;
        g2.drawImage(image, i*tileSize, k*tileSize, tileSize, tileSize, null); 

    }
    
    
}
