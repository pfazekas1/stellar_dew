package model;

public class GreenWheat extends Plant{

    private final boolean diesAfterFirstHarvest = true;
    private final int numberOfProducingYield = 1;
    private boolean isDead;
    private int daysToRipe = 3;

    public GreenWheat(int x, int y) {
        super(x, y, "GreenWheat");
        this.isDead = false;
    }


}
