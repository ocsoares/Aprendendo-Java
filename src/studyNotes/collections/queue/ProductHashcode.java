package studyNotes.collections.queue;

import java.util.Objects;

public class ProductHashcode {
    private final String name;
    private final double price;
    private final boolean isExpired;

    public ProductHashcode(String name, double price, boolean isExpired) {
        this.name = name;
        this.price = price;
        this.isExpired = isExpired;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isExpired=" + isExpired +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductHashcode productHashcode = (ProductHashcode) o;
        return Double.compare(price, productHashcode.price) == 0 && isExpired == productHashcode.isExpired;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, isExpired);
    }

    public double getPrice() {
        return price;
    }

    public boolean isExpired() {
        return isExpired;
    }
}
