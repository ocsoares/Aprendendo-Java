package studyNotes.collections.sort.sortWithObjects.binarySearch;

import java.util.Objects;

public class PersonComparable implements Comparable<PersonComparable> {
    private final String name;
    private final int age;
    private final String city;

    public PersonComparable(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersonComparable personComparable = (PersonComparable) o;
        return age == personComparable.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(PersonComparable o) {
        return Integer.compare(this.age, o.getAge());
    }

    public int getAge() {
        return age;
    }
}
