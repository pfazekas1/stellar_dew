package model;

public class BlueTree extends Plant{

    boolean diesAfterFirstHarvest;
    int numberOfProducingYield;
    boolean isDead;

    public BlueTree(int x, int y, String type) {
        super(x, y, type);
        this.numberOfProducingYield = setNumberOfProducingYield(type);
        this.diesAfterFirstHarvest = setDiesAfterFirstHarvest(type);
        this.isDead = false;

    }


}
