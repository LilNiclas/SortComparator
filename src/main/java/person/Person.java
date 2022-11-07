package person;

public class Person implements Comparable<Person> {
    private String navn;
    private int alder;
    private double vægt;
    private double højde;

    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public int compareTo(Person p) {
        return alder - p.getAlder();
        //return navn.compareTo(p.getNavn());
    }

    public String toString() {
        return ("Navn: " + navn + ", Alder: " + alder);
    }
}