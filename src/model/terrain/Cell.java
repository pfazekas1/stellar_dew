package model.terrain;

// Map or board will consist of different cell types
// TODO: Define terrain types with different attributes
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Cell{
    private boolean fertilized = false; //TODO: make it overwriteable
    private GroundType type;
    private int x;
    private int y;

    public Cell(GroundType type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public int returnX() { return x; }
    public int returnY() { return y; }

    public void draw(Graphics2D g2, int i, int k, int tileSize) {
        BufferedImage image = null;
        type.draw(g2, i, k, tileSize);

        g2.drawImage(image, i * tileSize, k * tileSize, tileSize, tileSize, null);
    }
    
}