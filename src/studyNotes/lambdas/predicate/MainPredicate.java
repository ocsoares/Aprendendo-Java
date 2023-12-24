package studyNotes.lambdas.predicate;

import studyNotes.collections.list.withObjects.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple", 2.43, false));
        fruitList.add(new Fruit("Lemon", 4.90, true));
        fruitList.add(new Fruit("Cherry", 1.30, false));

        // Nesse caso no Parâmetro do "Predicate", eu só espero Retornar as "Fruit" com "isExpired == false" !!!
        List<Fruit> unexpiredFruitList = filterFruitIfExpired(fruitList, fruit -> !fruit.isExpired());
        System.out.println("unexpiredFruitList: " + unexpiredFruitList);

        // Já nesse caso, no Parâmetro "Predicate" eu só espero Retornar as "Fruit" com "isExpired == true" !!!
        // ------------------------------------------------------------------------------------------------------
        // OBS: Usar "Fruit::isExpired" é A MESMA COISA que usar "fruit -> fruit.isExpired()", é só uma forma
        // mais SIMPLIFICADA, porque a Lambda só está usando UM Método!!!
        // -------------------------------------------------------------------------
        // OBS2: O uso de "Fruit::isExpired" é um exemplo de "Method Reference" !!!
        List<Fruit> expiredFruitList = filterFruitIfExpired(fruitList, Fruit::isExpired);
        System.out.println("expiredFruitList: " + expiredFruitList);
    }

    // Também pode usar a minha Interface "PredicateInterface" ia dar na MESMA, mas é que usar "Predicate<>" já tem
    // Vários Métodos PRONTOS e é mais Genérico!!!
    // --------------------------------------------------------------------------------------------------------------
    // OBS: Também pode usar o "BiPredicate" para passar DOIS Argumentos!!!f
    private static List<Fruit> filterFruitIfExpired(List<Fruit> fruitList, Predicate<Fruit> predicateInterface) {
        List<Fruit> fruitListFiltered = new ArrayList<>();

        for (Fruit fruit : fruitList) {
            // O valor "boolean" (q foi declarado nesse Método) será "true" ou "false" DEPENDENDO do Valor
            // ESPERADO passado no Parâmetro da Função!!!
            if (predicateInterface.test(fruit)) {
                fruitListFiltered.add(fruit);
            }
        }
        return fruitListFiltered;
    }
}
