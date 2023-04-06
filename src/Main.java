import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        GTree gT = new GTree();
        Person ivan = new Person("Ivan", "Ivanov", Gender.MALE);
        gT.append(ivan);
        Person masha = new Person("Mariya", "Ivanova", Gender.FEMALE);
        gT.append(masha);
        Person tanya = new Person("Tatyana", "Ivanova", Gender.FEMALE, masha, ivan);
        gT.append(tanya);
        Person vanya = new Person("Ivan", "Ivanov", Gender.MALE, masha, ivan);
        gT.append(vanya);
        Person petya = new Person("Petr", "Ivanov", Gender.FEMALE, masha, ivan);
        gT.append(petya);
        Person mashanya = new Person("Mariya", "Sidorova", Gender.FEMALE);
        gT.append(mashanya);
        Person vasya = new Person("Vasiliy", "Ivanov", Gender.MALE, mashanya, petya);
        gT.append(vasya);

        out.println(new Relation(gT).childsOf(petya));
        out.println(new Relation(gT).parentsOf(petya));
        out.println((new Relation(gT).parentsOf(ivan)));

        Implementator writer = new Implementator();
        writer.Savefile(gT.getGTree().toString());
    }
}