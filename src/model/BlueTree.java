package model;

public class BlueTree extends Plant{

    private final boolean diesAfterFirstHarvest = false;
    private final int numberOfProducingYield = 5;
    private boolean isDead;
    private int daysToRipe = 7;

    public BlueTree(int x, int y) {
        super(x, y, "BlueTree");
        this.isDead = false;

    }


}
