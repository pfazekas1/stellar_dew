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

                case 10:
                    field = setImage("10.png");
                    break;

                case 11:
                    field = setImage("11.png");
                    break;
                
                case 12:
                    field = setImage("12.png");
                    break;

                case 13:
                    field = setImage("13.png");
                    break;

                case 14:
                    field = setImage("14.png");
                    break;

                case 25:
                    field = setImage("25.png");
                    break;

                case 26:
                    field = setImage("26.png");
                    break;

                case 27:
                    field = setImage("27.png");
                    break;

                case 28:
                    field = setImage("28.png");
                    break;

                case 29:
                    field = setImage("29.png");
                    break;

                case 40:
                    field = setImage("40.png");
                    break;

                case 41:
                    field = setImage("41.png");
                    break;

                case 42:
                    field = setImage("42.png");
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
