package model.Plants;

public class RedBush extends Plant{

    private final boolean diesAfterFirstHarvest = false;
    private final int numberOfProducingYield = 3;
    private boolean isDead;
    private int daysToRipe = 5;

    public RedBush(int x, int y) {
        super(x, y, "RedBush");
        this.isDead = false;
    }


}
