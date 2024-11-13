package Flyweight;

import javafx.scene.image.Image;

public class SwampTile implements Tile {

    private final String IMAGE_PATH = "/images/frog.png";
    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public Image getImage() {
        return new Image(IMAGE_PATH, 25, 25, false, false);
    }

    @Override
    public String getType() {
        return "Swamp ";
    }
    
}
