package OOP;

public class PrintService {
    public void print(Gryffindor[] gryffindors) {
        System.out.println("*Гриффиндор*\n");
        for (Gryffindor students : gryffindors) {
            System.out.println(students);
            System.out.println();
        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println("*Пуффендуй*\n");
        for (Hufflepuff students : hufflepuffs) {
            System.out.println(students);
            System.out.println();
        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        System.out.println("*Когтевран*\n");
        for (Ravenclaw students : ravenclaws) {
            System.out.println(students);
            System.out.println();
        }
    }

    public void print(Slytherin[] slytherins) {
        System.out.println("*Слизерин*\n");
        for (Slytherin students : slytherins) {
            System.out.println(students);
            System.out.println();
        }
    }
}
