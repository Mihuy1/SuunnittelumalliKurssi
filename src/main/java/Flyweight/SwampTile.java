package Flyweight;

public class SwampTile implements Tile {

    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getType() {
        return "Swamp ";
    }
    
}
