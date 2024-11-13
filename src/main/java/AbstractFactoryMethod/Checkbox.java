package AbstractFactoryMethod;

public abstract class Checkbox {

    protected String text;
    protected boolean checked;

    public abstract void display();

    public void setText(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }
    
}
