package studyNotes.streams.summarizing;

import studyNotes.collections.list.withObjects.Fruit;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MainSummarizing {
    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple", 2.43, false));
        fruitList.add(new Fruit("Lemon", 4.90, true));
        fruitList.add(new Fruit("Cherry", 1.30, false));
        fruitList.add(new Fruit("Pêra", 8.32, true));
        fruitList.add(new Fruit("Laranja", 12.93, true));
        fruitList.add(new Fruit("Pêssego", 3.65, false));

        // Usar "summarizing" Mostra Várias INFORMAÇÕES e ESTATÍSTICAS de um Atributo de uma Lista, como a
        // Soma dos Números, MAIOR e MENOR número, a Média entre todos os números, etc.
        DoubleSummaryStatistics summarizingFruitList = fruitList.stream()
                .collect(Collectors.summarizingDouble(Fruit::getPrice));
        System.out.println("summarizingFruitList: " + summarizingFruitList);

        // Usei ", " no "joining" para SEPARAR as Palavras entre Vírgula e Espaço!!!
        String allFruitNames = fruitList.stream().map(Fruit::getName).collect(Collectors.joining(", "));
        System.out.println("allFruitNames: " + allFruitNames);

        DoubleSummaryStatistics nonExpiresSummaryFruit = fruitList.stream()
                .filter(fruit -> !fruit.isExpired())
                .collect(Collectors.summarizingDouble(Fruit::getPrice));

        System.out.println("nonExpiresSummaryFruit: " + nonExpiresSummaryFruit);
    }
}
