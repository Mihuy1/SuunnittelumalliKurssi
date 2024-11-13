package Flyweight;

import javafx.scene.image.Image;

public class BuildingTile implements Tile {

    private final String IMAGE_PATH = "/images/house.png";

    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public Image getImage() {
        return new Image(IMAGE_PATH, 25, 25, false, false);
    }

    @Override
    public String getType() {
        return "Building ";
    }
    
}
