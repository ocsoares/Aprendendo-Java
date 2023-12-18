package studyNotes.POO.classNotes.polymorphism;

public class Lasagna extends Product {
    public static final double TWENTY_PERCENT_FEE = 0.2;

    public Lasagna(String brand, double price, boolean isExpired) {
        super(brand, price, isExpired);
    }

    @Override
    public double calculateFee() {
        return this.price * Lasagna.TWENTY_PERCENT_FEE;
    }
}
