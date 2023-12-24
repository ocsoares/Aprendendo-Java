package studyNotes.lambdas.comparatorWithLambda;

import studyNotes.collections.list.withObjects.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainComparatorWithLambda {
    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple", 2.43, false));
        fruitList.add(new Fruit("Lemon", 4.90, true));
        fruitList.add(new Fruit("Cherry", 1.30, false));

        System.out.println("fruitList ANTES do sort por PRICE: " + fruitList);

        fruitList.sort((fruit, fruit2) -> Double.compare(fruit.getPrice(), fruit2.getPrice()));
        System.out.println("fruitList DEPOIS do sort por PRICE: " + fruitList);

        System.out.println("\n");

        fruitList.sort((fruit, fruit2) -> Boolean.compare(fruit.isExpired(), fruit2.isExpired()));
        System.out.println("fruitList DEPOIS do sort por BOOLEAN: " + fruitList);
    }
}
