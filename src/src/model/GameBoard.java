package model;

public class GameBoard {
    private int width, height;
    private Player player;

    public GameBoard(){
        loadGame();
        initGame();
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
