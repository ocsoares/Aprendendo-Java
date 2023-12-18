package studyNotes.POO.classNotes.polymorphism;

public abstract class Product implements Fee {
    protected final String brand;
    protected final double price;
    protected final boolean isExpired;

    protected Product(String brand, double price, boolean isExpired) {
        this.brand = brand;
        this.price = price;
        this.isExpired = isExpired;
    }

    @Override
    public String toString() {
        return "Product{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", isExpired=" + isExpired +
                '}';
    }

    public String getBrand() {
        return brand;
    }
}
