package comparator;

import person.Person;

import java.util.Comparator;

public class NavnComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        return p1.getNavn().compareTo(p2.getNavn());
    }

}
