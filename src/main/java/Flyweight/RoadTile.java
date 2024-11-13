package Flyweight;

import javafx.scene.image.Image;

public class RoadTile implements Tile {

    private static final String IMAGE_PATH = "/images/road.png"; // Adjust the path as needed
    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public Image getImage() {
        return new Image(IMAGE_PATH, 25, 25, false, false);
    }

    @Override
    public String getType() {
        return "Road ";
    }

}
