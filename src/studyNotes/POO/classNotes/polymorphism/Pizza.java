package studyNotes.POO.classNotes.polymorphism;

public class Pizza extends Product {
    public static final double TEN_PERCENT_FEE = 0.1;

    public Pizza(String brand, double price, boolean isExpired) {
        super(brand, price, isExpired);
    }

    @Override
    public double calculateFee() {
        return this.price * Pizza.TEN_PERCENT_FEE;
    }
}
