package studyNotes.designPatterns.builder;

public class PersonBuilder {
    private final String name;
    private final int age;
    private final String city;

    private PersonBuilder(Builder builder) {
        name = builder.name;
        age = builder.age;
        city = builder.city;
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public static final class Builder {
        private String name;
        private int age;
        private String city;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder city(String val) {
            city = val;
            return this;
        }

        public PersonBuilder build() {
            return new PersonBuilder(this);
        }
    }
}
