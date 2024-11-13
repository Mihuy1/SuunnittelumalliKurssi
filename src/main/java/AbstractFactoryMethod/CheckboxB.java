package AbstractFactoryMethod;

public class CheckboxB extends Checkbox {

    public CheckboxB(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }

    @Override
    public void display() {
        String checkboxText = "Checkbox B " + (checked ? "[x]" : "[ ]") + " " + text;
        int length = checkboxText.length();
        String line = "+-" + "-".repeat(length) + "-+";

        System.out.println(line);
        System.out.println("| " + checkboxText + " |");
        System.out.println(line);
    }
    
}
