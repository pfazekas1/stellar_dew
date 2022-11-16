package model.terrain;

import java.awt.Graphics2D;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Tree extends GroundType {
    private final int number;

    public Tree(int numbers) {
        super();
        number = numbers;
        getFieldImage(number);
        type = "tree";
    }

    private void getFieldImage(int number) {
        try {
            switch (number) {
                case 37:
                    tree = setImage("tree/37.png");
                    break;
                case 38:
                    tree = setImage("tree/38.png");
                    break;
                case 45:
                    tree = setImage("tree/45.png");
                    break;
                case 46:
                    tree = setImage("tree/46.png");
                    break;
                case 47:
                    tree = setImage("tree/47.png");
                    break;
                case 48:
                    tree = setImage("tree/48.png");
                    break;
                case 49:
                    tree = setImage("tree/49.png");
                    break;
                case 50:
                    tree = setImage("tree/50.png");
                    break;
                case 51:
                    tree = setImage("tree/51.png");
                    break;
                case 52:
                    tree = setImage("tree/52.png");
                    break;
                case 53:
                    tree = setImage("tree/53.png");
                    break;
                case 54:
                    tree = setImage("tree/54.png");
                    break;
                case 55:
                    tree = setImage("tree/55.png");
                    break;
                case 56:
                    tree = setImage("tree/56.png");
                    break;
                case 57:
                    tree = setImage("tree/57.png");
                    break;
                case 58:
                    tree = setImage("tree/58.png");
                    break;
                

                case 60:
                    tree = setImage("tree/60.png");
                    break;
                case 61:
                    tree = setImage("tree/61.png");
                    break;
                case 62:
                    tree = setImage("tree/62.png");
                    break;
                case 63:
                    tree = setImage("tree/63.png");
                    break;
                case 64:
                    tree = setImage("tree/64.png");
                    break;
                case 65:
                    tree = setImage("tree/65.png");
                    break;
                case 66:
                    tree = setImage("tree/66.png");
                    break;
                case 67:
                    tree = setImage("tree/67.png");
                    break;
                case 68:
                    tree = setImage("tree/68.png");
                    break;
                case 69:
                    tree = setImage("tree/69.png");
                    break;
                case 70:
                    tree = setImage("tree/70.png");
                    break;
                case 71:
                    tree = setImage("tree/71.png");
                    break;
                case 72:
                    tree = setImage("tree/72.png");
                    break;
                case 73:
                    tree = setImage("tree/73.png");
                    break;


                case 75:
                    tree = setImage("tree/75.png");
                    break;
                case 76:
                    tree = setImage("tree/76.png");
                    break;
                case 77:
                    tree = setImage("tree/77.png");
                    break;
                case 78:
                    tree = setImage("tree/78.png");
                    break;
                case 79:
                    tree = setImage("tree/79.png");
                    break;
                case 80:
                    tree = setImage("tree/80.png");
                    break;
                case 81:
                    tree = setImage("tree/81.png");
                    break;
                case 82:
                    tree = setImage("tree/82.png");
                    break;
                case 83:
                    tree = setImage("tree/83.png");
                    break;
                case 84:
                    tree = setImage("tree/84.png");
                    break;
                case 85:
                    tree = setImage("tree/85.png");
                    break;
                case 86:
                    tree = setImage("tree/86.png");
                    break;
                case 87:
                    tree = setImage("tree/87.png");
                    break;
                case 88:
                    tree = setImage("tree/88.png");
                    break;


                case 90:
                    tree = setImage("tree/90.png");
                    break;
                case 91:
                    tree = setImage("tree/91.png");
                    break;
                case 92:
                    tree = setImage("tree/92.png");
                    break;
                case 93:
                    tree = setImage("tree/93.png");
                    break;
                case 94:
                    tree = setImage("tree/94.png");
                    break;
                case 95:
                    tree = setImage("tree/95.png");
                    break;
                case 96:
                    tree = setImage("tree/96.png");
                    break;
                case 97:
                    tree = setImage("tree/97.png");
                    break;
                case 98:
                    tree = setImage("tree/98.png");
                    break;
                case 99:
                    tree = setImage("tree/99.png");
                    break;
                case 100:
                    tree = setImage("tree/100.png");
                    break;
                case 101:
                    tree = setImage("tree/101.png");
                    break;
                case 102:
                    tree = setImage("tree/102.png");
                    break;
                case 103:
                    tree = setImage("tree/103.png");
                    break;
                

                case 108:
                    tree = setImage("tree/108.png");
                    break;
                case 109:
                    tree = setImage("tree/109.png");
                    break;
                case 112:
                    tree = setImage("tree/112.png");
                    break;
                case 113:
                    tree = setImage("tree/113.png");
                    break;
                case 116:
                    tree = setImage("tree/116.png");
                    break;
                case 117:
                    tree = setImage("tree/117.png");
                    break;
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics2D g2, int i, int k, int tileSize) {
        BufferedImage image = null;
        image = tree;
        g2.drawImage(image, i*tileSize, k*tileSize, tileSize, tileSize, null); 

    }
    
    
}
