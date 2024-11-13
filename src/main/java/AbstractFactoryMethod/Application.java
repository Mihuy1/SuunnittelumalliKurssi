package AbstractFactoryMethod;

public class Application {

    public static void main(String[] args) {
        UIFactory factory = new BFactory();

        Checkbox checkbox = factory.createCheckbox("I am a checkbox", true);
        checkbox.display();

        System.out.println("Update text of checkbox");

        checkbox.setText("Updated checkbox", false);
        checkbox.display();

        Button button = factory.createButton("I am a button");
        button.display();

        System.out.println("Update Button");

        button.setText("Updated Button!");
        button.display();

        TextField textField = factory.createTextField("I am a textField");
        textField.display();

        System.out.println("Update textField");

        textField.setText("I am an updated textField!");
        textField.display();
    }
    
}
