import java.awt.*;
import java.util.ArrayList;

public class HexGame {
    private int size;
    private DisjointSet gameboard;

    public HexGame(int dimensions) {
        this.size = dimensions;
        gameboard = new DisjointSet(size*2);
    }

    public boolean playBlue(int position, boolean displayNeighbors) {

    }
    public boolean playRed(int position, boolean displayNeighbors) {

    }
    public Color[] getGrid() {

    }
    public int getSize() {
        return size;
    }
    private boolean isOccupied(int position) {

    }
    private ArrayList<Integer> getNeighborsRed(int position) {

    }
    private ArrayList<Integer> getNeighborsBlue(int position) {

    }
}
