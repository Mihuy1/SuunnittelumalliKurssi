package State;

public class Intermediate extends State{
    public Intermediate(GameCharacter gameCharacter) {
        super(gameCharacter);
    }

    @Override
    public void train() {
        System.out.println("Train...");
        getGameCharacter().setExperiencePoints(getGameCharacter().getExperiencePoints() + 10);
    }

    @Override
    public void meditate() {
        System.out.println("Meditating...");
        getGameCharacter().setExperiencePoints(getGameCharacter().getExperiencePoints() + 20);
        getGameCharacter().setHealth(getGameCharacter().getHealth() + 5);
    }

    @Override
    public void fight() {
        System.out.println("Too low level to fight");
    }


}
