package model.Plants;

import static java.lang.Math.round;

public abstract class Plant {

    protected int xCoord;
    protected int yCoord;
    protected String typeOfPlant;
    protected boolean diesAfterFirstHarvest;
    protected boolean isDead;
    protected int daysToRipe;
    protected int numberOfProducingYield;

    public Plant(int x, int y, String type){
        setCoords(x,y);
        this.typeOfPlant = type;
        this.isDead = false;
    }

    public void setCoords(int x,int y){
        this.xCoord = x;
        this.yCoord = y;
    }

    //extra idea: maybe we could record that the plant was watered for certain days, if yes we could add more boost to the growing
    public int boostDaysToRipe(int baseNumber, boolean groundIsFertilized){
        //fertilizer is 0.7x
        if(groundIsFertilized){
            return (int)round(baseNumber*0.7);
        }
        return baseNumber;
    }

    //getters setters

    public boolean getIsDead(){
        return isDead;
    }

    public boolean getDiesAfterFirstHarvest() {
        return diesAfterFirstHarvest;
    }

    public void setDead() {
        this.isDead = true;
    }

    public int getDaysToRipe() {
        return daysToRipe;
    }

    public int getNumberOfProducingYield() {
        return numberOfProducingYield;
    }

}
