package model;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private final Player testPlayer = new Player(42, 56);

    @Test
    void useWater() {
        testPlayer.fillWater();
        testPlayer.useWater();
        assertEquals(9, testPlayer.getWater());
    }

    @Test
    void fillWater() {
        testPlayer.useWater();
        testPlayer.fillWater();
        assertEquals(10, testPlayer.getWater());
    }

    @Test
    void setMoney() {
        assertEquals(0, testPlayer.getMoney());
        testPlayer.setMoney(100);
        assertEquals(100, testPlayer.getMoney());
    }

    @Test
    void setPos() {
        Point p = new Point(50, 50);
        testPlayer.setPos(p);
        assertEquals(50, testPlayer.getPos().x);
        assertEquals(50, testPlayer.getPos().y);
    }

    @Test
    void wallCollision() {
        assertTrue(testPlayer.collidesWithWall());
        Point p = new Point(1500, 3500);
        testPlayer.setPos(p);
        assertFalse(testPlayer.collidesWithWall());
    }

    @Test
    void collisionWithObject() {
        Point p = new Point(50, 50);
        int size = 50;
        assertTrue(testPlayer.collidesWithObject(p, size, size));
        Point p2 = new Point(1500, 3500);
        testPlayer.setPos(p2);
        assertFalse(testPlayer.collidesWithObject(p, size, size));
    }

    @Test
    void inventory() {
        String item = "Seed";
        String falseItem = "Fish";
        int itemCount = 5;

        assertFalse(testPlayer.isElementInInventory(item));
        testPlayer.addElementToInventory(item, itemCount);
        assertTrue(testPlayer.isElementInInventory(item));

        assertEquals(itemCount, testPlayer.getElementCount(item));
        assertEquals(-1, testPlayer.getElementCount(falseItem));

        testPlayer.changeValue(item, 6);
        assertEquals(6, testPlayer.getElementCount(item));

        testPlayer.removeFromInventory(item);
        assertFalse(testPlayer.isElementInInventory(item));
    }
}