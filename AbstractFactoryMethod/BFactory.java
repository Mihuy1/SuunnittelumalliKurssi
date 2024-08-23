package AbstractFactoryMethod;

public class BFactory implements UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonB(text);
    }

    @Override
    public Checkbox createCheckbox(String text, boolean checked) {
        return new CheckboxB(text, checked);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldB(text);
    }
}
