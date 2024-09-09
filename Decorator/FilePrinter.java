package Decorator;

public class FilePrinter extends PrinterDecorator{

    public FilePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        super.print(message);
        writeToFile(message);
    }

    private void writeToFile(String message) {
        try {
            String filename = "log.txt";
            java.io.FileWriter fileWriter = new java.io.FileWriter(filename, true);
            fileWriter.write(message + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
