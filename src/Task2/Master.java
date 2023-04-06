package Task2;

import static java.lang.System.out;

public class Master {
    String name;
    int age;

    final private String catCallSound = "Кс-кс!";
    final private String catFeedSound = "Кушай!";
    final private String catDriveAwaySound = "Брысь!";

    public Master(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callPet(Cat pet) {
        out.println(catCallSound + " " + pet.getName() + "!");
        pet.beCalled(this);

    }

    public void feedPet(Cat pet) {
        if (pet.getPosition() == Position.HERE) {
            out.println(catFeedSound + " " + pet.getName() + "!");
        }


    }
    public void driveAvayPet(Cat pet) {
        out.println(catDriveAwaySound + " " + pet.getName() + "!");
        pet.beDrivedAway(this);
    }
}
