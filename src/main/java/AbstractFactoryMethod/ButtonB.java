package AbstractFactoryMethod;

public class ButtonB extends Button {

    public ButtonB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        String buttonText = "Button B: " + text;
        int length = buttonText.length();
        String line = "+-" + "-".repeat(length) + "-+";

        System.out.println(line);
        System.out.println("| " + buttonText + " |");
        System.out.println(line);
    }

}
