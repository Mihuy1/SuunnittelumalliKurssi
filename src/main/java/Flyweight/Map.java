package Flyweight;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public abstract class Map {

    abstract Tile createTile();

    public GridPane display(int rows, int cols) {
        Tile[][] tiles = new Tile[rows][cols];
        GridPane gridPane = new GridPane();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tiles[i][j] = createTile();
                Image image = tiles[i][j].getImage();
                if (image != null) {
                    ImageView imageView = new ImageView(image);
                    gridPane.add(imageView, j, i);
                }
            }
        }

        return gridPane;
    }

}
