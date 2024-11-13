package Flyweight;

public abstract class Map {

    abstract Tile createTile();

    public void display(int rows, int cols) {
        Tile[][] tiles = new Tile[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tiles[i][j] = createTile();
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }

}
