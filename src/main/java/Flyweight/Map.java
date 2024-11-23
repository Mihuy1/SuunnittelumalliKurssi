package Flyweight;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public abstract class Map {

    abstract String getTileType();

    public GridPane display(int rows, int cols) {
        GridPane gridPane = new GridPane();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Tile tile = TileGraphicFactory.getTile(getTileType());
                Image image = tile.getImage();
                if (image != null) {
                    ImageView imageView = new ImageView(image);
                    gridPane.add(imageView, j, i);
                }
            }
        }
        return gridPane;
    }
}