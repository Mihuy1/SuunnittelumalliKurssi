package AbstractFactoryMethod;

public class ButtonA extends Button {

    public ButtonA(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        String buttonText = "Button A: " + text;
        int length = buttonText.length();
        String line = "+-" + "-".repeat(length) + "-+";

        System.out.println(line);
        System.out.println("| " + buttonText + " |");
        System.out.println(line);
    }
    
}
