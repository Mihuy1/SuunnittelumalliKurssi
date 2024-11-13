package Decorator;

public class BasicPrinter implements Printer { // ConcreteComponent
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
