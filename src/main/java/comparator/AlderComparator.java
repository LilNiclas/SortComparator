package comparator;

import person.Person;

import java.util.Comparator;

public class AlderComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        return p1.getAlder() - (p2.getAlder());


    }
}
