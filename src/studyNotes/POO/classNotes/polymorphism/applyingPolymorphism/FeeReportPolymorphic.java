package studyNotes.POO.classNotes.polymorphism.applyingPolymorphism;

import studyNotes.POO.classNotes.polymorphism.Pizza;
import studyNotes.POO.classNotes.polymorphism.Product;

public class FeeReportPolymorphic {
    private FeeReportPolymorphic() {
    }

    // Dessa maneira, recebe como Parâmetro desse Método "genérico" as Classes POLIMÓRFICAS da Classe Product!!!
    public static void feeReportProduct(Product product, double fee) {
        System.out.println("-------------------------------------------------------------");
        // Faz algo APENAS quando o TIPO da INSTÂNCIA for uma Especificada!!
        if (product instanceof Pizza) {
            System.out.println("instanceof PIZZA !!!");
        } else {
            System.out.println("instanceof NÃO é Pizza !");
        }

        System.out.println("Relatório da taxa do PRODUTO !");

        System.out.println("Taxa de " + fee + " do PRODUTO de marca " + product.getBrand() + " sendo aplicada !");
        double productFee = product.calculateFee();
        System.out.println("productFee no RELATÓRIO do Produto: " + productFee);
    }
}
