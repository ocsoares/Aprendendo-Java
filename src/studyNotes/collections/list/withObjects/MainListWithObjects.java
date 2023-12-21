package studyNotes.collections.list.withObjects;

import java.util.ArrayList;
import java.util.List;

public class MainListWithObjects {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 2.43, false);
        Fruit lemon = new Fruit("Lemon", 4.90, true);
        Fruit cherry = new Fruit("Cherry", 1.30, false);

        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(apple);
        fruitList.add(lemon);
        fruitList.add(cherry);

        System.out.println("fruitList: " + fruitList);

        for (Fruit fruit : fruitList) {
            System.out.println("Fruta: " + fruit);
        }

        System.out.println("\n");

        // O "contains" utiliza o "equals", então para o Código abaixo funcionar, tem que SOBRESCREVER
        // esse Método BUSCANDO algum Atributo!!
        Fruit otherApple = new Fruit("Apple", 2.43, false);
        System.out.println("otherApple CONTÉM em fruitList?: " + fruitList.contains(otherApple));

        // Quando NÃO encontra o Índice, retorna "-1" !!!
        int otherAppleIndex = fruitList.indexOf(otherApple);
        System.out.println("index do otherApple ENCONTRADO em fruitList: " + otherAppleIndex);

        if (otherAppleIndex != -1) {
            System.out.println("Pegando o otherAppleIndex ENCONTRADO de fruitList: " + fruitList.get(otherAppleIndex));
        }
    }
}
