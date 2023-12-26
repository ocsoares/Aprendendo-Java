package studyNotes.streams.basic;

import studyNotes.collections.list.withObjects.Fruit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple", 2.43, false));
        fruitList.add(new Fruit("Lemon", 4.90, true));
        fruitList.add(new Fruit("Cherry", 1.30, false));
        fruitList.add(new Fruit("Pêra", 8.32, true));
        fruitList.add(new Fruit("Laranja", 12.93, true));
        fruitList.add(new Fruit("Pêssego", 3.65, false));

        Stream<Fruit> streamFruitList = fruitList.stream();
        System.out.println("streamFruitList count: " + streamFruitList.count());

        System.out.println("\n");

        List<String> fruitNamesListWithPriceBiggerThanFour = fruitList.stream()
                .sorted(Comparator.comparing(Fruit::getPrice)) // Sort pelo PREÇO, do MENOR para o MAIOR!
                .filter(fruit -> fruit.getPrice() > 4) // FILTRA pelos que tem PREÇO MAIOR que 4!
                .limit(2) // LIMITA a Lista a Tamanho 2!
                .map(Fruit::getName) // Retorna APENAS o NAME das "fruit" que obedeçam aos Critérios A CIMA!
                .toList(); // RETORNA em LISTA (sem isso Retorna em Stream) !!!

        System.out.println("fruitNamesListWithPriceBiggerThanFour: " + fruitNamesListWithPriceBiggerThanFour);

        long fruitsPricedLessThanFour = fruitList.stream().distinct().filter(fruit -> fruit.getPrice() > 4).count();
        System.out.println("fruitsPricedLessThanFour: " + fruitsPricedLessThanFour);

        System.out.println("\n");

        List<String> fruitNamesListNonExpires = fruitList.stream()
                .sorted(Comparator.comparing(Fruit::getPrice))
                .filter(Fruit::isExpired)
                .map(Fruit::getName)
                .toList();

        System.out.println("fruitNamesListNonExpires: " + fruitNamesListNonExpires);

        List<Fruit> nonExpiredListFruits = fruitList.stream()
                .sorted(Comparator.comparing(Fruit::isExpired))
                .filter(fruit -> !fruit.isExpired())
                .toList();

        System.out.println("nonExpiredListFruits: " + nonExpiredListFruits);

        List<Fruit> expiredListFruits = fruitList.stream()
                .sorted(Comparator.comparing(Fruit::isExpired))
                .filter(Fruit::isExpired)
                .toList();

        System.out.println("expiredListFruits: " + expiredListFruits);

        System.out.println("\n");

        // Usar "System.out::println" é a MESMA coisa que "fruit -> System.out.println(fruit)" !!!
        // Também PODE usar um "stream()" ANTES de "forEach", mas NÃO é necessário!!
        expiredListFruits.forEach(System.out::println);

        System.out.println("\n");

        expiredListFruits.forEach(fruit -> System.out.println("expiredListFruits: " + fruit));
    }
}
