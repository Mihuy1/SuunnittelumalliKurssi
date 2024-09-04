package AbstractFactoryMethod;

public abstract class Button {

    protected String text;

    public abstract void display();

    public void setText(String text) {
        this.text = text;
    }
    
}