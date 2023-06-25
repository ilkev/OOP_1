package OOP;

public class Slytherin extends Hogwarts {
    private final int cunning;
    private final int resoluteness;
    private final int ambition;
    private final int resourcefulness;
    private final int leadership;

    public Slytherin(String name, int magicPower, int transgressionPower, int cunning, int resoluteness, int ambition, int resourcefulness, int leadership) {
        super(name, magicPower, transgressionPower);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.leadership = leadership;
    }

    public int totalPoints() {
        return cunning + resourcefulness + ambition + resourcefulness + leadership;
    }

    public boolean compare(Slytherin slytherin) {
        return this.totalPoints() > slytherin.totalPoints();
    }

    public void printCompare(Slytherin slytherin) {
        if (this.compare(slytherin)) {
            System.out.println(this.name + "лучший слизеринец, чем " + slytherin.name);
        } else {
            System.out.println(slytherin.name + " лучший силзеринец, чем " + this.name);
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n Сила магии: " + magicPower + "\n Расстояние трансгрессии: " + transgressionPower + "\n Хитрость: " + cunning + "\n Решительность: " + resoluteness + "\n Амбициозность: " + ambition + "\n Находичивость: " + resourcefulness + "\n Жажда власти: " + leadership;
    }
}
