package studyNotes.streams.reduce;

import studyNotes.collections.list.withObjects.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainReduce {
    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple", 2.43, false));
        fruitList.add(new Fruit("Lemon", 4.90, true));
        fruitList.add(new Fruit("Cherry", 1.30, false));
        fruitList.add(new Fruit("Pêra", 8.32, true));
        fruitList.add(new Fruit("Laranja", 12.93, true));
        fruitList.add(new Fruit("Pêssego", 3.65, false));

        // Esse "0" é o Número INICIAL a ser somado, e usando "0" apenas faz o Retorno ser "Double" ao
        // invés de "Optional<Double>" !!!
        // --------------------------------------------------
        // OBS: Isso é OPCIONAL !!!
        Double allFruitPricesAddUp = fruitList.stream().map(Fruit::getPrice).reduce((double) 0, Double::sum);
        System.out.println("allFruitPricesAddUp: " + allFruitPricesAddUp);

        // Em Alguns casos, por questões de Performance, usar dessa maneira pode ser MELHOR, porque Transforma
        // TODOS os números do tipo "Double" (Wrapper) em PRIMITIVOS (double) !!!
        double allFruitPricesAddUpMapToDouble = fruitList.stream().mapToDouble(Fruit::getPrice).sum();
        System.out.println("allFruitPricesAddUpMapToDouble: " + allFruitPricesAddUpMapToDouble);

        double allFruitPricesBiggerThanEightAddUp = fruitList.stream()
                .mapToDouble(Fruit::getPrice)
                .filter(price -> price > 8)
                .sum();
        System.out.println("allFruitPricesBiggerThanEightAddUp: " + allFruitPricesBiggerThanEightAddUp);

        System.out.println("\n");

        List<Integer> numbersList = List.of(5, 10, 4);

        Integer allNumbersAddUp = numbersList.stream().reduce(0, Integer::sum);
        System.out.println("allNumbersAddUp: " + allNumbersAddUp);

        Optional<Integer> smallestNumber = numbersList.stream().reduce(Integer::min);
        System.out.println("smallestNumber: " + smallestNumber);

        Integer biggestNumber = numbersList.stream().reduce(0, Integer::max);
        System.out.println("biggestNumber: " + biggestNumber);
    }
}
