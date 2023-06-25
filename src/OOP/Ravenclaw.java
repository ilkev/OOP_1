package OOP;

public class Ravenclaw extends Hogwarts{
    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionPower, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionPower);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int totalPoints() {
        return intelligence + wisdom + creativity;
    }

    public boolean compare(Ravenclaw ravenclaw) {
        return this.totalPoints() > ravenclaw.totalPoints();
    }

    public void printCompare(Ravenclaw ravenclaw) {
        if (this.compare(ravenclaw)) {
            System.out.println(this.name + "лучший когтевранец, чем " + ravenclaw.name);
        } else {
            System.out.println(ravenclaw.name + " лучший когтевранец, чем " + this.name);
        }
    }

    public String toString() {
        return "Имя: " + name + "\n Сила магии: " + magicPower + "\n Расстояние трансгрессии: " + transgressionPower + "\n Интеллект: " + intelligence + "\n Мудрость: " + wisdom + "\n остроумие: " + wit + "\n креативность: " + creativity;
    }
}
