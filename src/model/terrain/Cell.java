package model.terrain;

// Map or board will consist of different cell types
// TODO: Define terrain types with different attributes

public class Cell {
    private boolean fertilized = false; //TODO: make it overwriteable
    private GroundType type;
    private int x;
    private int y;

    public Cell(GroundType type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    public int returnX() { return x; }
    public int returnY() { return y; }
    
}