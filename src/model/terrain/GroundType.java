package model.terrain;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;

public abstract class GroundType {
    private String type;
    private String fileName;
    private final String imagePath = "img/";
    BufferedImage grass, road, trunk, white_flower, pink_flower;
    

    public BufferedImage setImage(String path) throws IOException {
        return ImageIO.read(new File(imagePath + path));
    }

    public abstract void draw(Graphics2D g2, int i, int k, int tileSize);

}
