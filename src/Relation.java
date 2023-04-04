import java.util.ArrayList;

public class Relation {
    ArrayList<Person> gTree;

    public Relation(GTree genialogicalTree) {
        gTree = genialogicalTree.getGTree();
    }

    public ArrayList<Person> childsOf(Person person) {
        ArrayList<Person> tree = new ArrayList<>();
        for (Person gT:gTree) {
            if (gT.mother == person || gT.father == person) {
                tree.add(gT);
            }
        }
        return tree;
    }

    public ArrayList<Person> parentsOf(Person person) {
        ArrayList<Person> tree = new ArrayList<>();
        if (person.getMother() == null || person.getFather() == null) {
            tree.add(new Person("UNKNOWN", "ANCESTOR", Gender.UNKNOWN));
        }
        else {
            tree.add(person.mother);
            tree.add(person.father);
        }
        return tree;
    }
}
