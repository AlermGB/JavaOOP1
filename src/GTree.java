import java.util.ArrayList;

public class GTree {
    private ArrayList<Person> gTree = new ArrayList<>();

    public void setGTree(ArrayList<Person> gTree) {
        this.gTree = gTree;
    }

    public ArrayList<Person> getGTree() {
        return gTree;
    }
    public void append(Person person) {
        gTree.add(person);
    }

}
