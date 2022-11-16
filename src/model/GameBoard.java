package model;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import model.terrain.Cell;
import model.terrain.Fields;
import model.terrain.Grass;
import model.terrain.Road;
import model.terrain.Tree;

public class GameBoard {
    Cell [][] board;
    private int width, height;
    private Player player;
    private final String filename = "img/test_map2.csv";

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
                
                for(String index : row){
                    int num = Integer.parseInt(index);
                    if(index.equals("16")){
                        Cell element = new Cell(new Grass(num), x, y);
                        board[y][x] = element;
                        ++y;
                    } else {
                        if(index.equals("5") || index.equals("6") || index.equals("7") || index.equals("20") || index.equals("21") || index.equals("22")){
                            Cell element = new Cell(new Grass(num), x, y);
                            board[y][x] = element;
                            ++y;
                        } else {
                            if(index.equals("0") || index.equals("1") || index.equals("2") || index.equals("3") || index.equals("4") 
                            || index.equals("15") || index.equals("17") || index.equals("18") || index.equals("19")
                            || index.equals("30") || index.equals("31") || index.equals("32") || index.equals("33")){
                                Cell element = new Cell(new Road(num), x, y);
                                board[y][x] = element;
                                ++y;
                            } else {
                                if(index.equals("34")){
                                    Cell element = new Cell(new Fields(num), x, y);
                                    board[y][x] = element;
                                    ++y;
                                } else {
                                    if(index.equals("37") || index.equals("38") 
                                    || index.equals("45") || index.equals("46") || index.equals("47") || index.equals("48") || index.equals("49") || index.equals("50") || index.equals("51") || index.equals("52") || index.equals("53") || index.equals("54") || index.equals("55") || index.equals("56") || index.equals("57") || index.equals("58")
                                    || index.equals("60") || index.equals("61") || index.equals("62") || index.equals("63") || index.equals("64") || index.equals("65") || index.equals("66") || index.equals("67") || index.equals("68") || index.equals("69") || index.equals("70") || index.equals("71") || index.equals("72") || index.equals("73")
                                    || index.equals("75") || index.equals("76") || index.equals("77") || index.equals("78") || index.equals("79") || index.equals("80") || index.equals("81") || index.equals("82") || index.equals("83") || index.equals("84") || index.equals("85") || index.equals("86") || index.equals("87") || index.equals("88")
                                    || index.equals("90") || index.equals("91") || index.equals("92") || index.equals("93") || index.equals("94") || index.equals("95") || index.equals("96") || index.equals("97") || index.equals("98") || index.equals("99") || index.equals("100") || index.equals("101") || index.equals("102") || index.equals("103")
                                    || index.equals("108") || index.equals("109") || index.equals("112") || index.equals("113") || index.equals("116") || index.equals("117")){
                                        Cell element = new Cell(new Tree(num), x, y);
                                        board[y][x] = element;
                                        ++y;
                                    } else {
                                        Cell element = new Cell(new Grass(16), x, y);
                                        board[y][x] = element;
                                        ++y;
                                    }
                                }
                            }
                        }
                    }
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
