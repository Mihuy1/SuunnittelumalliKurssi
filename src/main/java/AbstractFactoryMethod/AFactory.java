package AbstractFactoryMethod;

public class AFactory implements UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    public Checkbox createCheckbox(String text, boolean checked) {
        return new CheckboxA(text, checked);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldA(text);
    }
}
