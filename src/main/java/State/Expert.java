package State;

public class Expert extends State{
    public Expert(GameCharacter gameCharacter) {
        super(gameCharacter);
    }

    @Override
    public void train() {
        System.out.println("Fighting...");
        getGameCharacter().setExperiencePoints(getGameCharacter().getExperiencePoints() + 10);
        System.out.println("Level: " + getGameCharacter().getLevel());
        System.out.println("Experience Points: " + getGameCharacter().getExperiencePoints());
        System.out.println("Health: " + getGameCharacter().getHealth());
    }

    @Override
    public void meditate() {
        System.out.println("Meditating...");
        getGameCharacter().setExperiencePoints(getGameCharacter().getExperiencePoints() + 20);
        getGameCharacter().setHealth(getGameCharacter().getHealth() + 5);
    }

    @Override
    public void fight() {
        System.out.println("Fighting...");
        getGameCharacter().setExperiencePoints(getGameCharacter().getExperiencePoints() + 30);
        getGameCharacter().setHealth(getGameCharacter().getHealth() - 10);
    }
}
