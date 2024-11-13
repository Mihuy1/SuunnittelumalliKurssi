package AbstractFactoryMethod;

public class TextFieldB extends TextField {

    public TextFieldB(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        String textFieldText = "TextField B: " + text;
        int length = textFieldText.length();
        String line = "+-" + "-".repeat(length) + "-+";

        System.out.println(line);
        System.out.println("| " + textFieldText + " |");
        System.out.println(line);
    }
    
}
