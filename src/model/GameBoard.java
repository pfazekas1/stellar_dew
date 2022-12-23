package model;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import model.terrain.Buildings;
import model.terrain.Cell;
import model.terrain.Fields;
import model.terrain.Grass;
import model.terrain.Road;
import model.terrain.Tree;

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
        player = new Player(15, 15);
        
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
                                if(index.equals("34") || index.equals("10") || index.equals("11") || index.equals("12") || index.equals("13") || index.equals("14") || index.equals("25") || index.equals("26") || index.equals("27")
                                || index.equals("28") || index.equals("29") || index.equals("40") || index.equals("41") || index.equals("42")){
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
                                        if(index.equals("120") || index.equals("121") || index.equals("122") 
                                        || index.equals("135") || index.equals("137") || index.equals("150") 
                                        || index.equals("151") || index.equals("152") || index.equals("165")
                                        || index.equals("167") || index.equals("180") || index.equals("181") 
                                        || index.equals("182") || index.equals("183") || index.equals("184") 
                                        || index.equals("185") || index.equals("186") || index.equals("187")
                                        || index.equals("188") || index.equals("189") || index.equals("190")
                                        || index.equals("191") || index.equals("195") || index.equals("196")
                                        || index.equals("197") || index.equals("198") || index.equals("199")
                                        || index.equals("200") || index.equals("201") || index.equals("202")
                                        || index.equals("203") || index.equals("204") || index.equals("205")
                                        || index.equals("206") || index.equals("210") || index.equals("211")
                                        || index.equals("212") || index.equals("213") || index.equals("214")
                                        || index.equals("215") || index.equals("216") || index.equals("217")
                                        || index.equals("218") || index.equals("219") || index.equals("220")
                                        || index.equals("221") || index.equals("225") || index.equals("226")
                                        || index.equals("227") || index.equals("228") || index.equals("229")
                                        || index.equals("230") || index.equals("231") || index.equals("232")
                                        || index.equals("233") || index.equals("234") || index.equals("235")
                                        || index.equals("236") || index.equals("240") || index.equals("241")
                                        || index.equals("242") || index.equals("243") || index.equals("244")
                                        || index.equals("245") || index.equals("246") || index.equals("247")
                                        || index.equals("248") || index.equals("249") || index.equals("250")
                                        || index.equals("251") || index.equals("255") || index.equals("256")
                                        || index.equals("257") || index.equals("258") || index.equals("259")
                                        || index.equals("260") || index.equals("261") || index.equals("262")
                                        || index.equals("263") || index.equals("264") || index.equals("265")
                                        || index.equals("266") || index.equals("274") || index.equals("275")
                                        || index.equals("276") || index.equals("277") || index.equals("278")
                                        || index.equals("279") || index.equals("280") || index.equals("281")
                                        || index.equals("289") || index.equals("290") || index.equals("291")
                                        || index.equals("292") || index.equals("293") || index.equals("294")
                                        || index.equals("295") || index.equals("296")){
                                            Cell element = new Cell(new Buildings(num), x, y);
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
