package model.terrain;

import java.awt.Graphics2D;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Road extends GroundType {    
    private final int number;

    public Road(int numbers) {
        super();
        number = numbers;
        getFieldImage(number);
        type = "road";
    }

    private void getFieldImage(int number) {
        try {
            switch (number) {
                case 0:
                    road = setImage("0.png");
                    break;
                case 1:
                    road = setImage("1.png");
                    break;
                case 2:
                    road = setImage("2.png");
                    break;
                case 3:
                    road = setImage("3.png");
                    break;
                case 4:
                    road = setImage("4.png");
                    break;
                case 15:
                    road = setImage("15.png");
                    break;
                case 17:
                    road = setImage("17.png");
                    break;
                case 18:
                    road = setImage("18.png");
                    break;
                case 19:
                    road = setImage("19.png");
                    break;
                case 30:
                    road = setImage("30.png");
                    break;
                case 31:
                    road = setImage("31.png");
                    break;
                case 32:
                    road = setImage("32.png");
                    break;
                case 33:
                    road = setImage("road.png");
                    break;
            
                default:
                    break;
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics2D g2, int i, int k, int tileSize) {
        BufferedImage image = null;
        image = road;
        g2.drawImage(image, i*tileSize, k*tileSize, tileSize, tileSize, null); 

    }
    
    
}
