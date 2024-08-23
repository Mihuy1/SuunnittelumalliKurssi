package AbstractFactoryMethod;

public interface UIFactory {
    public Button createButton(String text);
    public Checkbox createCheckbox(String text, boolean checked);
    public TextField createTextField(String text);
}
