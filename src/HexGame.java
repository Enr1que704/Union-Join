
import java.util.ArrayList;

public class HexGame {
    public int size;
    public DisjointSet gameboard;
    private int TOP_EDGE;
    private int BOTTOM_EDGE;
    private int LEFT_EDGE;
    private int RIGHT_EDGE;
    private int[] colorArray;
    public Color colorType;

    public enum Color {
        NONE,
        RED,
        BLUE
    }

    public HexGame(int dimensions) {
        this.size = dimensions;
        int totalTiles = dimensions*2;
        gameboard = new DisjointSet(totalTiles + 4);
        TOP_EDGE = totalTiles + 1;
        BOTTOM_EDGE = totalTiles + 2;
        LEFT_EDGE = totalTiles + 3;
        RIGHT_EDGE = totalTiles + 4;
        colorArray = new int[totalTiles];
    }

    public boolean playBlue(int position, boolean displayNeighbors) {
        if (displayNeighbors) {
            System.out.println("Cell " + position + ": [" + getNeighborsBlue(position) + "]");
        }

        if (gameboard.find(LEFT_EDGE) == gameboard.find(RIGHT_EDGE)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean playRed(int position, boolean displayNeighbors) {
        if (displayNeighbors) {
            System.out.println("Cell " + position + ": [" + getNeighborsRed(position) + "]");
        }
        if (gameboard.find(TOP_EDGE) == gameboard.find(BOTTOM_EDGE)) {
            return true;
        } else {
            return false;
        }
    }

//    public Color[] getGrid() {
//    }

    public int getSize() {
        return size;
    }

    private boolean isOccupied(int position) {
        return true;
    }

    private ArrayList<Integer> getNeighborsRed(int position) {
        return new ArrayList<>();
    }

    private ArrayList<Integer> getNeighborsBlue(int position) {
        return new ArrayList<>();
    }
}
// if there is a neighbor of the SAME color as the one just placed, union the cells together