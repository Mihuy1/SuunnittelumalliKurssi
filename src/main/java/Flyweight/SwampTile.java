package Flyweight;

import javafx.scene.image.Image;

public class SwampTile implements Tile {
    private static final String IMAGE_PATH = "/images/frog.png";
    private static final Image IMAGE = new Image(IMAGE_PATH, 25, 25, false, false);

    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public Image getImage() {
        return IMAGE;
    }

    @Override
    public String getType() {
        return "Swamp";
    }
}