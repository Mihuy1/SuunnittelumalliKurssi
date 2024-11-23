package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<String, Tile> tilesMap = new HashMap<>();

    public static Tile getTile(String tileType) {
        Tile tile = tilesMap.get(tileType);
        if (tile == null) {
            switch (tileType) {
                case "road":
                    tile = new RoadTile();
                    break;
                case "swamp":
                    tile = new SwampTile();
                    break;
                case "water":
                    tile = new WaterTile();
                    break;
                case "forest":
                    tile = new ForestTile();
                    break;
                case "building":
                    tile = new BuildingTile();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid tile type: " + tileType);
            }
            tilesMap.put(tileType, tile);
        }
        return tile;
    }
}