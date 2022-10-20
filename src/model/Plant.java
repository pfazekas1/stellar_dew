package model;

import static java.lang.Math.round;

public abstract class Plant {

    protected int xCoord;
    protected int yCoord;
    protected String typeOfPlant;
    protected boolean diesAfterFirstHarvest;
    protected boolean isDead;

    public Plant(int x, int y, String type){
        setCoords(x,y);
        this.typeOfPlant = type;
        this.isDead = false;
    }

    public void setCoords(int x,int y){
        this.xCoord = x;
        this.yCoord = y;

    }

    public boolean setDiesAfterFirstHarvest(String type){
        if(type.equals("Blue")){
            return false;
        }
        if(type.equals("Red")){
            return false;
        }
        //more will be here
        return true;

    }

    public int setNumberOfProducingYield(String type){
        if(type.equals("Blue")){
            return 5;
        }
        if(type.equals("Red")){
            return 2;
        }
        //more will be here
        return 0;

    }

    //extra idea: maybe we could record that the plant was watered for certain days, if yes we could add more boost to the growing
    public int daysToRipe(int baseNumber, boolean groundIsFertilized){
        //fertilizer is 0.7x
        if(groundIsFertilized){
            return (int)round(baseNumber*0.7);
        }
        return baseNumber;
    }

    public boolean getIsDead(){
        return isDead;
    }

    public boolean isDiesAfterFirstHarvest() {
        return diesAfterFirstHarvest;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

}
