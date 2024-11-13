package Flyweight;

import javafx.scene.image.Image;

public class ForestTile implements Tile {

    private final String IMAGE_PATH = "/images/forest.png";

    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public Image getImage() {
        return new Image(IMAGE_PATH, 25, 25, false, false);
    }

    @Override
    public String getType() {
        return "Forest ";
    }
    
}
