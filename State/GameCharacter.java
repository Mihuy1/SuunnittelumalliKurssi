package State;

public class GameCharacter {
    private State state;

    private String name;
    private int level;
    private double experience_points;
    private int health;

    public GameCharacter(String name, int level, double experience_points, int health) {
        this.name = name;
        this.level = level;
        this.experience_points = experience_points;
        this.health = health;
        this.state = new Novice(this);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getExperiencePoints() {
        return experience_points;
    }

    public int getHealth() {
        return health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExperiencePoints(double experience_points) {
        this.experience_points = experience_points;

        if (this.experience_points >= 100 && this.experience_points < 200) {
            this.state = new Intermediate(this);
            setLevel(2);
        } else if (this.experience_points >= 200) {
            this.state = new Expert(this);
            setLevel(3);
        }
        if (this.experience_points >= 300) {
            this.state = new Master(this);
            setLevel(4);
        }
    }

    public void setHealth(int health) {
        this.health = health;
        if (this.health <= 0) {
            System.out.println("You have died...");
            System.exit(0);
        }
    }

    public State getState() {
        return state;
    }
}
