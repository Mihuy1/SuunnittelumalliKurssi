package State;

public class Master extends State{
    public Master(GameCharacter gameCharacter) {
        super(gameCharacter);
    }

    @Override
    public void train() {
        System.out.println("You won the game! You are now a master!");
    }

    @Override
    public void meditate() {
        System.out.println("You won the game! You are now a master!");
    }

    @Override
    public void fight() {
        System.out.println("You won the game! You are now a master!");
    }
}
