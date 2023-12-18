package studyNotes.POO.classNotes.polymorphism.applyingPolymorphism;

import studyNotes.POO.classNotes.polymorphism.Lasagna;
import studyNotes.POO.classNotes.polymorphism.Pizza;
import studyNotes.POO.classNotes.polymorphism.Product;

public class MainProductPolymorphic {
    public static void main(String[] args) {
        // Obviamente, "Pizza" é filha de "Product", então PODE ser Instanciada dessa maneira (POLIMORFISMO) !!
        Product pizza = new Pizza("Seara", 21.90, false);
        System.out.println("pizza: " + pizza);
        FeeReportPolymorphic.feeReportProduct(pizza, Pizza.TEN_PERCENT_FEE);

        System.out.println("\n");

        Product lasagna = new Lasagna("Renata", 40.29, false);
        System.out.println("lasagna: " + lasagna);
        FeeReportPolymorphic.feeReportProduct(lasagna, Lasagna.TWENTY_PERCENT_FEE);
    }
}
