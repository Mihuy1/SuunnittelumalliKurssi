package Flyweight;

import java.util.Random;

public class CityMap extends Map {
    private final Random random = new Random();

    @Override
    public String getTileType() {
        int rand = random.nextInt(3); // Generates 0, 1, or 2
        switch (rand) {
            case 0:
                return "road";
            case 1:
                return "forest";
            case 2:
                return "building";
            default:
                return "road";
        }
    }
}