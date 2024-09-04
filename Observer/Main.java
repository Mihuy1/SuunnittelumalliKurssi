package Observer;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Observer> observers = new ArrayList<>();
        WeatherStation weatherStation = new WeatherStation(new Random().nextInt(15), observers);

        WeatherObserver observer1 = new WeatherObserver("Observer 1");
        WeatherObserver observer2 = new WeatherObserver("Observer 2");
        WeatherObserver observer3 = new WeatherObserver("Observer 3");

        weatherStation.subscribe(observer1);
        weatherStation.subscribe(observer2);
        weatherStation.subscribe(observer3);

        weatherStation.start();

        Thread.sleep(10000);

        weatherStation.unsubscribe(observer3);

    }
}
