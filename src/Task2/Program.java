package Task2;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        Master petr = new Master("Петр", 21);
        Cat cat1 = new Cat("Барсик", 1);
        Cat cat2 = new Cat("Мурзик", 3);

        out.println("--------------");
        cat1.catInfo();
        petr.callPet(cat1);
        cat1.catInfo();

        out.println("--------------");
        cat2.catInfo();
        cat2.askMeal(petr);
        cat2.catInfo();

        out.println("--------------");
        petr.driveAvayPet(cat1);
        petr.driveAvayPet(cat2);
        cat1.catInfo();
        cat2.catInfo();
    }
}
