package studyNotes.collections.iterator;

import studyNotes.collections.sort.sortWithObjects.binarySearch.Person;

import java.util.ArrayList;
import java.util.List;

// O "iterator" varre a Lista procurando algo!!
public class MainIterator {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Fábio Alonso", 40, "Rio de Janeiro"));
        personList.add(new Person("Ricardo Neves", 25, "São Paulo"));
        personList.add(new Person("Natália Costa", 31, "Belo Horizonte"));

        for (Person person : personList) {
            System.out.println("person: " + person);
        }

        System.out.println("\n");

//        Iterator<Person> personIterator = personList.iterator();
//        System.out.println("personIterator: " + personIterator);

        // O "removeIf" usa o "iterator" por debaixo dos panos!!
        personList.removeIf(person -> person.getAge() < 40);

        for (Person person : personList) {
            System.out.println("person DEPOIS do removeIf: " + person);
        }

    }
}
