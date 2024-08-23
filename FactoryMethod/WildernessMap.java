package FactoryMethod;

import java.util.Random;

public class WildernessMap extends Map {
    private Random random = new Random();
    
    @Override
    public Tile createTile() {
        int rand = random.nextInt(3);

        switch(rand) {
            case 0:
                return new SwampTile();
            case 1:
                return new ForestTile();
            case 2:
                return new WaterTile();
            default:
                return null;
        }
    }
}
