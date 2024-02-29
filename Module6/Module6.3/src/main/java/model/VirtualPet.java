package model;

public class VirtualPet {
    private int x;
    private int y;
    private static final int GRID_SIZE = 30;

    public VirtualPet(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getGridSize() {
        return GRID_SIZE;
    }

}
