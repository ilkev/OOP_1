package OOP;

public class Hogwarts {
    public final String name;
    public final int magicPower;
    public final int transgressionPower;

    public Hogwarts(String name, int magicPower, int transgressionPower) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionPower = transgressionPower;
    }

    public int totalPoints() {
        return magicPower + transgressionPower;
    }

    public boolean compare(Hogwarts hogwarts) {
        return this.totalPoints() > hogwarts.totalPoints();
    }

    public void printCompare(Hogwarts hogwarts) {
        if (this.compare(hogwarts)) {
            System.out.println(this.name + "лучший студент, чем " + hogwarts.name);
        } else {
            System.out.println(hogwarts.name + " лучший студент, чем " + this.name);
        }
    }
}
