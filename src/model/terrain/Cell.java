package model.terrain;

// Map or board will consist of different cell types
// TODO: Define terrain types with different attributes
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Cell{
    private boolean fertilized = false; //TODO: make it overwriteable
    private GroundType type;
    private int x;
    private int y;
    private BufferedImage grass;

    public Cell(GroundType type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
        setImage();
    }

    private void setImage() {

        try {
            grass = ImageIO.read(new File("img/grass.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public int returnX() { return x; }
    public int returnY() { return y; }

    public void draw(Graphics2D g2, int i, int k, int tileSize) {
        BufferedImage image = null;
        type.draw(g2, i, k, tileSize);

        //image = grass;
        //g2.drawImage(image, i * tileSize, k * tileSize, tileSize, tileSize, null);
    }
    
}