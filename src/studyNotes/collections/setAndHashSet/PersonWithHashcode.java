package studyNotes.collections.setAndHashSet;

import java.util.Objects;

public class PersonWithHashcode {
    private final String name;
    private final int age;
    private final String city;

    public PersonWithHashcode(String name, int age, String city) {
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
        PersonWithHashcode that = (PersonWithHashcode) o;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "PersonWithHashcode{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }
}
