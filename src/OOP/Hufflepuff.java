package OOP;

public class Hufflepuff extends Hogwarts {
    private final int hardWork;
    private final int loyalty;
    private final int patience;

    public Hufflepuff(String name, int magicPower, int transgressionPower, int hardWork, int loyalty, int patience) {
        super(name, magicPower, transgressionPower);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.patience = patience;
    }

    public int totalPoints() {
        return hardWork + loyalty + patience;
    }

    public boolean compare(Hufflepuff hufflepuff) {
        return this.totalPoints() > hufflepuff.totalPoints();
    }

    public void printCompare(Hufflepuff hufflepuff) {
        if (this.compare(hufflepuff)) {
            System.out.println(this.name + "лучший пуффендуец, чем " + hufflepuff.name);
        } else {
            System.out.println(hufflepuff.name + " лучший пуффендуец, чем " + this.name);
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n Сила магии: " + magicPower + "\n Расстояние трансгрессии: " + transgressionPower + "\n верность: " + loyalty + "\n трудолюбие: " + hardWork + "\n честность: " + patience;
    }
}
