package model;

public class RedBush extends Plant{

    private boolean diesAfterFirstHarvest;
    private int numberOfProducingYield;
    private boolean isDead;
    private int daysToRipe = 5;

    public RedBush(int x, int y, String type) {
        super(x, y, type);
        this.numberOfProducingYield = setNumberOfProducingYield(type);
        this.diesAfterFirstHarvest = setDiesAfterFirstHarvest(type);
        this.isDead = false;
    }

    public int getDaysToRipe() {
        return daysToRipe;
    }

    public void setDaysToRipe(int daysToRipe) {
        this.daysToRipe = daysToRipe;
    }

    public int getNumberOfProducingYield() {
        return numberOfProducingYield;
    }
}