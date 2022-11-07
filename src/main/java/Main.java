import comparator.AlderComparator;
import comparator.NavnComparator;
import person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] tal = {6, 3, 7, 5, 9};
        Arrays.sort(tal);
        System.out.println(Arrays.toString(tal));

        Person p1 = new Person("Poul", 27);
        Person p2 = new Person("Karl", 19);
        Person p3 = new Person("Jarl", 80);
        Person p4 = new Person("Jarl", 5);

        Person[] personer = {p1, p2, p3};

        Arrays.sort(personer, new NavnComparator());
        System.out.println(Arrays.toString(personer));

        ArrayList<Person> personList = new ArrayList<Person>(List.of(p1, p2, p3, p4));

        Collections.sort(personList, new AlderComparator());
        System.out.println("\n" + "Personliste sorteret efter alder: " + personList);

        Collections.sort(personList, new NavnComparator().thenComparing(new AlderComparator().reversed())); //.reversed gør rækkefølgen omvendt
        System.out.println("\n" + "Personliste sorteret primært efter navn, sekundært efter alder: " + personList);


    }


}
