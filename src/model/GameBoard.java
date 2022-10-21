package model;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import model.terrain.Cell;
import model.terrain.Grass;

public class GameBoard {
    Cell [][] board;
    private int width, height;
    private Player player;
    private final String filename = "img/test_map.csv";

    public GameBoard(int width, int height){
        this.width = width;
        this.height = height;
        board = new Cell[width][height];
        
        initGame();
        loadGame(filename);
    }

    /**
     * Method initialises values used by the game at the start of the program
     */
    private void initGame(){

    }

    /**
     * This method loads predefined data into the game. ex.: Game map
     */
    private void loadGame(String filename){
        BufferedReader reader = null;
        String line = "";
        int x = 0;
        int y = 0;

        try {
            reader = new BufferedReader(new FileReader(filename));
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");
                y=0;
                Cell element = new Cell(new Grass(), x, y);
                for(String index : row){
                    element = new Cell(new Grass(), x, y);
                    board[x][y] = element;
                    ++y;
                }
                ++x;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public int getWidth() { return  width; }

    public int getHeight() { return  height; }

    public Cell[][] getBoard() {
        return board;
    }

}
