package studyNotes.streams.findAndMatch;

import studyNotes.collections.list.withObjects.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainFindAndMatch {
    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple", 2.43, false));
        fruitList.add(new Fruit("Lemon", 4.90, true));
        fruitList.add(new Fruit("Cherry", 1.30, false));
        fruitList.add(new Fruit("Pêra", 8.32, true));
        fruitList.add(new Fruit("Laranja", 12.93, true));
        fruitList.add(new Fruit("Pêssego", 3.65, false));

        // O "anyMatch" é para encontrar QUALQUER ELEMENTO que atenda a uma Condição!
        boolean thereIsFruitBiggerThanThirteen = fruitList.stream().anyMatch(fruit -> fruit.getPrice() > 13);
        System.out.println("thereIsFruitBiggerThanThirteen: " + thereIsFruitBiggerThanThirteen);

        boolean thereIsFruitBiggerThanEleven = fruitList.stream().anyMatch(fruit -> fruit.getPrice() > 11);
        System.out.println("thereIsFruitBiggerThanEleven: " + thereIsFruitBiggerThanEleven);

        boolean isAllFruitsBiggerThanOne = fruitList.stream().allMatch(fruit -> fruit.getPrice() > 1);
        System.out.println("isAllFruitsBiggerThanOne: " + isAllFruitsBiggerThanOne);

        boolean isAllFruitsBiggerThanThree = fruitList.stream().allMatch(fruit -> fruit.getPrice() > 3);
        System.out.println("isAllFruitsBiggerThanThree: " + isAllFruitsBiggerThanThree);

        // Nesse caso, verifica se NENHUMA Fruta é MENOR que 1!!!
        boolean isNoFruitLessThanOne = fruitList.stream().noneMatch(fruit -> fruit.getPrice() < 1);
        System.out.println("isNoFruitLessThanOne: " + isNoFruitLessThanOne);

        fruitList.stream()
                .filter(fruit -> fruit.getPrice() > 4)
                .findFirst()
                .ifPresent(fruit -> System.out.println("PRIMEIRA Fruta com o preço MAIOR que 4 encontrada: " + fruit));
    }
}
