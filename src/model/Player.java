package model;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.awt.image.BufferedImage;

import model.terrain.GroundType;

public class Player extends GroundType{
    private final int movementSpeed = 10;
    private int money, water;
    private Point pos;
    private final int modelHeight = 200, modelWidth = 300;
    private Rectangle hitbox;

    private static class Item{
        String itemName;
        int itemCount;
    }
    private HashSet<Item> inventory = new HashSet<>();

    public Player(int x, int y){
        super();
        getFieldImage();
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

    public void addElementToInventory(String itemName, int itemCount){
        Item item = new Item();
        item.itemName = itemName;
        item.itemCount = itemCount;
        inventory.add(item);
    }

    public boolean isElementInInventory(String itemName){
        for (Item item : inventory) {
            if (item.itemName.equals(itemName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method returns the number of a specified item in the inventory.
     * @param itemName Type of item you are looking for
     * @return Number of item present in inventory. -1 if there is no such item.
     */
    public int getElementCount(String itemName){
        for (Item item : inventory) {
            if (item.itemName.equals(itemName)) {
                return item.itemCount;
            }
        }
        return -1;
    }

    public void removeFromInventory(String itemName){
        inventory.removeIf(item -> Objects.equals(item.itemName, itemName));
    }

    /**
     * Here you can change how much of a specific item do you have in the inventory
     * @param itemName Type of item you want to change
     * @param itemCount How much you have in the inventory
     */
    public void changeValue(String itemName, int itemCount){
        removeFromInventory(itemName);
        addElementToInventory(itemName, itemCount);
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

    private void getFieldImage() {
        try {
            player = setImage("player.png");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics2D g2, int i, int k, int tileSize) {
        BufferedImage image = null;
        image = player;
        g2.drawImage(image, i*tileSize, k*tileSize, tileSize, tileSize, null); 

        
    }
}
