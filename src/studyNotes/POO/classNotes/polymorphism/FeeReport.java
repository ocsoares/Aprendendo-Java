package studyNotes.POO.classNotes.polymorphism;

public class FeeReport {
    // Deixando o Constructor como "private" para essa Classe NÃO ser INSTANCIADA, porque só vai usar
    // os Métodos STATIC !!!!
    private FeeReport() {
    }

    public static void feeReportPizza(Pizza pizza) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Relatório da taxa da PIZZA !");

        System.out.println("Taxa de 10% da PIZZA sendo aplicada !");
        double pizzaFee = pizza.calculateFee();
        System.out.println("pizzaFee no RELATÓRIO da Pizza: " + pizzaFee);
    }

    public static void feeReportLasagna(Lasagna lasagna) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Relatório da taxa da LASANHA !");

        System.out.println("Taxa de 20% da LASANHA sendo aplicada !");
        double lasagnaFee = lasagna.calculateFee();
        System.out.println("lasagnaFee no RELATÓRIO da Lasanha: " + lasagnaFee);
    }
}
