package model;

public abstract class Plant {

    int xCoord;
    int yCoord;
    String typeOfPlant;
    boolean diesAfterFirstHarvest;
    boolean isDead;

    //const fileba
    private int daysToRipe =  3;
    private int numberOfProducingYield =  5;

    public Plant(int x, int y, String type){
        setCoords(x,y);
        this.typeOfPlant = type;
        this.isDead = false;
    }

    public void setCoords(int x,int y){
        //xCoords.add(x);
        //yCoords.add(y);
        this.xCoord = x;
        this.yCoord = y;

    }

    public boolean setDiesAfterFirstHarvest(String type){
        if(type.equals("Blue")){
            return false;
        }
        //more will be here


        return true;

    }

    public int setNumberOfProducingYield(String type){
        if(type.equals("Blue")){
            return 5;
        }
        //more will be here

        return 0;

    }

    public boolean getIsDead(){
        return isDead;
    }


    public void setDead(boolean dead) {
        isDead = dead;
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
