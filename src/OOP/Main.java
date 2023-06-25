package OOP;

public class Main {
    private static final Gryffindor[] gryffindors = new Gryffindor[3];
    private static final Hufflepuff[] hufflepuffs = new Hufflepuff[3];
    private static final Ravenclaw[] ravenclaws = new Ravenclaw[3];
    private static final Slytherin[] slytherins = new Slytherin[3];

    public static void main(String[] args) {
        gryffindors[0] = new Gryffindor("Гарри Поттер", getScale(), getScale(), getScale(), getScale(), getScale());
        gryffindors[1] = new Gryffindor("Гермиона Грейнджер", getScale(), getScale(), getScale(), getScale(), getScale());
        gryffindors[2] = new Gryffindor("Рон Уизли", getScale(), getScale(), getScale(), getScale(), getScale());

        hufflepuffs[0] = new Hufflepuff("Захария Смит", getScale(), getScale(), getScale(), getScale(), getScale());
        hufflepuffs[1] = new Hufflepuff("Седрик Диггори", getScale(), getScale(), getScale(), getScale(), getScale());
        hufflepuffs[2] = new Hufflepuff("Джастин Финч-Флетчли", getScale(), getScale(), getScale(), getScale(), getScale());

        ravenclaws[0] = new Ravenclaw("Чжоу Чанг", getScale(), getScale(), getScale(), getScale(), getScale(), getScale());
        ravenclaws[1] = new Ravenclaw("Падма Патил", getScale(), getScale(), getScale(), getScale(), getScale(), getScale());
        ravenclaws[2] = new Ravenclaw("Маркус Белби", getScale(), getScale(), getScale(), getScale(), getScale(), getScale());

        slytherins[0] = new Slytherin("Драко Малфой", getScale(), getScale(), getScale(), getScale(), getScale(), getScale(), getScale());
        slytherins[1] = new Slytherin("Грэхэм Монтегю", getScale(), getScale(), getScale(), getScale(), getScale(), getScale(), getScale());
        slytherins[2] = new Slytherin("Грегори Гойл", getScale(), getScale(), getScale(), getScale(), getScale(), getScale(), getScale());

        PrintService printService = new PrintService();
        printService.print(gryffindors);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        printService.print(slytherins);

        System.out.println("\nСравнение по факультетам");
        gryffindors[0].printCompare(gryffindors[2]);
        hufflepuffs[0].printCompare(hufflepuffs[2]);
        ravenclaws[0].printCompare(ravenclaws[2]);
        slytherins[0].printCompare(slytherins[2]);

        System.out.println("\nСравнение среди всех студентов:");
        gryffindors[0].printCompare(slytherins[0]);
    }

    public static int getScale() {
        int start = 1;
        int end = 100;
        return (int) Math.round((Math.random() * (end - start)) + start);
    }
}