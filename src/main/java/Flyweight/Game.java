package Flyweight;


public class Game {

    public static void main(String[] args) {
        Game game = new Game();

        Map cityMap = game.createMap("wilderness");

        cityMap.display(5, 5);        
    }

    public Map createMap(String str) {
        switch (str) {
            case "city":
                return new CityMap();
            case "wilderness":
                return new WildernessMap();
            default:
                return null;
        }
    }
    
}
