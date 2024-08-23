package AbstractFactoryMethod;

public class CheckboxA extends Checkbox {

    public CheckboxA(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }

    @Override
    public void display() {
        String checkboxText = (checked ? "[x]" : "[ ]") + " " + text;
        int length = checkboxText.length();
        String line = "+-" + "-".repeat(length) + "-+";

        System.out.println(line);
        System.out.println("| " + checkboxText + " |");
        System.out.println(line);
    }
    
}
