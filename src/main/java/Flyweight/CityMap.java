package Flyweight;

import java.util.Random;

class CityMap extends Map {
    private Random random = new Random();

    @Override
    public Tile createTile() {
        int rand = random.nextInt(3); // Generates 0, 1, or 2
        switch (rand) {
            case 0:
                return TileGraphicFactory.getTile("road");
            case 1:
                return TileGraphicFactory.getTile("forest");
            case 2:
                return TileGraphicFactory.getTile("building");
            default:
                return null;
        }
    }
}