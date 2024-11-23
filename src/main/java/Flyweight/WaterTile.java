package Flyweight;

import javafx.scene.image.Image;

public class WaterTile implements Tile {
    private static final String IMAGE_PATH = "/images/water.png";
    private static final Image IMAGE = new Image(IMAGE_PATH, 25, 25, false, false);

    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public Image getImage() {
        return IMAGE;
    }

    @Override
    public String getType() {
        return "Water";
    }
}