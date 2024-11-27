package Facade;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        APIClientFacade apiClientFacade = new APIClientFacade();

        // Chuck Norris Joke Example
        String chuckNorrisApiUrl = "https://api.chucknorris.io/jokes/random";
        try {
            String joke = apiClientFacade.getAttributeValueFromJson(chuckNorrisApiUrl, "value");
            System.out.println("Chuck Norris Joke: " + joke);
        } catch (IOException | IllegalArgumentException e) {
            System.err.println("Error fetching Chuck Norris joke: " + e.getMessage());
        }

        // Foreign Exchange Rates Example
        String forexApiUrl = "https://api.fxratesapi.com/latest";
        try {
            String baseCurrency = apiClientFacade.getAttributeValueFromJson(forexApiUrl, "base");
            System.out.println("Base Currency: " + baseCurrency);
        } catch (IOException | IllegalArgumentException e) {
            System.err.println("Error fetching foreign exchange rates: " + e.getMessage());
        }
    }
}
