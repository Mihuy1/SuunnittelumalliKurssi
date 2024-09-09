package Decorator;

public class Main {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Hello, World!");

        Printer printer2 = new FilePrinter(new BasicPrinter());
        printer2.print("Hello, World!");

        Printer printer3 = new EncryptedPrinter(new BasicPrinter());
        printer3.print("Hello, World!");

    }
}
