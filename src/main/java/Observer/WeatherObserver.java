package Observer;

public class WeatherObserver implements Observer {

    private final String name;

    public WeatherObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int temperature) {
        System.out.println(name + " received update: Current temperature is: " + temperature + " degrees.");
    }
}