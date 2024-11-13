package State;

public class Novice extends State{
    public Novice(GameCharacter gameCharacter) {
        super(gameCharacter);
    }

    @Override
    public void train() {
        System.out.println("Training...");
        getGameCharacter().setExperiencePoints(getGameCharacter().getExperiencePoints() + 10);
    }

    @Override
    public void meditate() {
        System.out.println("Too low level to meditate");
    }

    @Override
    public void fight() {
        System.out.println("Too low level to fight");
    }
}
