package model;

import java.awt.Point;
import java.awt.Rectangle;

public class Player {
    private final int movementSpeed = 10;
    private int money, water;
    private Point pos;
    private final int modelHeight = 200, modelWidth = 300;
    private Rectangle hitbox;

    // TODO: Inventory. Best way of doing this would be with tuples imo, but that needs some package not included in the current java version. Will do later.
    //

    public Player(int x, int y){
        pos = new Point(x, y);
        this.money = 0;
        this.water = 0;
        hitbox = new Rectangle(pos.x, pos.y, pos.x + modelWidth, pos.y + modelHeight);
    }

    // TODO: We should keep in mind that water level can't be under 0. This exception needs to be handled at usage!
    public void useWater() {
        if(this.water > 0) this.water -= 1;
    }

    public void fillWater(){
        this.water = 10;
    }

    public int getWater(){
        return water;
    }

    public void setMoney(int money){
        this.money += money;
    }

    public int getMoney() {
        return money;
    }

    public Point getPos() {
        return pos;
    }

    public void setPos(Point pos) {
        this.pos = pos;
        hitbox.x = pos.x;
        hitbox.y = pos.y;
        hitbox.width = pos.x + modelWidth;
        hitbox.height = pos.y + modelHeight;
    }

    /**
     * This method calculates if the player hitbox collides with another object like a plant or animal.
     * @param p Point type of the object we want the collision calculated for.
     * @param width Width of the object we want the collision calculated for.
     * @param height Height of the object we want the collision calculated for.
     * @return True if the player collides with some object.
     */
    public boolean collidesWithObject(Point p, int width, int height){
        Rectangle r1 = new Rectangle(p.x, p.y, p.x + width, p.y + height);
        return r1.intersects(hitbox);
    }

    /**
     * This method calculates if the player hitbox collides with the wall.
     * @return True if the player is inside the playing field.
     */
    public boolean collidesWithWall(){
        Rectangle r1 = new Rectangle(0, 0, 1200, 2000); //Width and height are temporary. Will change later
        return r1.contains(hitbox);
    }
}
