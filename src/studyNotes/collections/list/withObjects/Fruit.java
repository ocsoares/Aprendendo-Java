package studyNotes.collections.list.withObjects;

import java.util.Objects;

public class Fruit {
    private final String name;
    private final double price;
    private final boolean isExpired;

    public Fruit(String name, double price, boolean isExpired) {
        this.name = name;
        this.price = price;
        this.isExpired = isExpired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isExpired=" + isExpired +
                '}';
    }
}