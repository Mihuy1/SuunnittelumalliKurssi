package Flyweight;

import java.util.Random;

public class WildernessMap extends Map {
    private Random random = new Random();

    @Override
    public Tile createTile() {
        int rand = random.nextInt(3);

        switch (rand) {
            case 0:
                return TileGraphicFactory.getTile("swamp");
            case 1:
                return TileGraphicFactory.getTile("forest");
            case 2:
                return TileGraphicFactory.getTile("water");
            default:
                return null;
        }
    }
}
