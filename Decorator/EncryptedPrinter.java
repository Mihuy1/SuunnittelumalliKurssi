package Decorator;

public class EncryptedPrinter  extends PrinterDecorator {

    private static final int SHIFT = 3; // Shift for Caesar Cipher

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        super.print(encrypt(message));
    }

    private String encrypt(String message) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) ((character - base + SHIFT) % 26 + base);
            }
            encryptedMessage.append(character);
        }
        return encryptedMessage.toString();
    }
}
