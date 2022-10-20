package model;

import model.terrain.Cell;

public class GameBoard {
    Cell [][] board;
    private int width, height;
    private Player player;

    public GameBoard(int width, int height){
        this.width = width;
        this.height = height;
        board = new Cell[width][height];
        
        initGame();
        loadGame();
    }

    /**
     * Method initialises values used by the game at the start of the program
     */
    private void initGame(){

    }

    /**
     * This method loads predefined data into the game. ex.: Game map
     */
    private void loadGame(){

    }

    public int getWidth() { return  width; }

    public int getHeight() { return  height; }
}
