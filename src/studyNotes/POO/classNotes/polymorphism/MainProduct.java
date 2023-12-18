package studyNotes.POO.classNotes.polymorphism;

public class MainProduct {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Pizza Hut", 43.57, false);
        System.out.println("Pizza fee value: " + Pizza.TEN_PERCENT_FEE);
        double pizzaFee = pizza.calculateFee();
        System.out.println("pizzaFee: " + pizzaFee);
        FeeReport.feeReportPizza(pizza);

        System.out.println("\n");

        Lasagna lasagna = new Lasagna("Barilla", 60.81, false);
        System.out.println("Lasagna fee value: " + Lasagna.TWENTY_PERCENT_FEE);
        double lasagnaFee = lasagna.calculateFee();
        System.out.println("lasagnaFee: " + lasagnaFee);
        FeeReport.feeReportLasagna(lasagna);
    }
}
