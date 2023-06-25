package OOP;

public class Gryffindor extends Hogwarts {
    private final int nobleness;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int magicPower, int transgressionPower, int nobleness, int honor, int bravery) {
        super(name, magicPower, transgressionPower);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int totalPoints() {
        return nobleness + honor + bravery;
    }

    public boolean compare(Gryffindor gryffindor) {
        return this.totalPoints() > gryffindor.totalPoints();
    }

    public void printCompare(Gryffindor gryffindor) {
        if (this.compare(gryffindor)) {
            System.out.println(this.name + " лучший грифиндорец, чем " + gryffindor.name);
        } else {
            System.out.println(gryffindor.name + " лучший грифиндорец, чем " + this.name);
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n Сила магии: " + magicPower + "\n Расстояние трансгрессии: " + transgressionPower + "\n благородство: " + nobleness + "\n честь: " + honor + "\n храбрость: " + bravery;
    }
}
