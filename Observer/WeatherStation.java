package Observer;

import java.util.ArrayList;
import java.util.Random;

public class WeatherStation extends Thread {

    private ArrayList<Observer> observers;

    private int currentTemperature;

    Random rand = new Random();

    private static final int MIN_TEMPERATURE = 0;
    private static final int MAX_TEMPERATURE = 25;

    private static final int MIN_DELAY = 1000;
    private static final int MAX_DELAY = 5000;

    public WeatherStation(int currentTemperature, ArrayList<Observer> observers) {
        this.currentTemperature = currentTemperature;
        this.observers = observers;
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(int temperature) {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    public void simpleWeatherSimulation() {
       boolean randomBoolean = rand.nextBoolean();

       if (randomBoolean) {
           currentTemperature++;
           if (currentTemperature >= MAX_TEMPERATURE) {
               currentTemperature = MAX_TEMPERATURE;
           }
       } else {
           currentTemperature--;
           if (currentTemperature <= MIN_TEMPERATURE) {
               currentTemperature = MIN_TEMPERATURE;
           }
       }
       notifyObservers(currentTemperature);

        int randomDelay = rand.nextInt(MAX_DELAY) + MIN_DELAY;

        try {
            System.out.println("Delay started, with delay " + randomDelay);
            Thread.sleep(randomDelay * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Delay finished");

    }



    public void run() {

        while (true) {
            simpleWeatherSimulation();
        }
    }
}
