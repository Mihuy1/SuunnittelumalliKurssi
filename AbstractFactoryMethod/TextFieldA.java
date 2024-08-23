package AbstractFactoryMethod;

public class TextFieldA extends TextField {

    public TextFieldA(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        String textFieldText = "TextField A: " + text;
        int length = textFieldText.length();
        String line = "+-" + "-".repeat(length) + "-+";

        System.out.println(line);
        System.out.println("| " + textFieldText + " |");
        System.out.println(line);
    }
    
}
