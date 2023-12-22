package studyNotes.collections.navigableSet;

import studyNotes.collections.sort.sortWithObjects.binarySearch.Person;

import java.util.Comparator;

public class PersonByNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
