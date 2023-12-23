package studyNotes.generics.genericClass;

import studyNotes.POO.classNotes.polymorphism.Pizza;
import studyNotes.collections.setAndHashSet.PersonWithHashcode;

import java.util.ArrayList;
import java.util.List;

public class MainGenericClass {
    public static void main(String[] args) {
        List<PersonWithHashcode> personWithHashcodeList = new ArrayList<>();
        personWithHashcodeList.add(new PersonWithHashcode("Fábio Alonso", 25, "Rio de Janeiro"));
        personWithHashcodeList.add(new PersonWithHashcode("Ricardo Neves", 19, "São Paulo"));

        // Como o "PersonWithHashcode" foi passado como Classe GENÉRICA, PRECISA passar uma Lista desse MESMO Tipo
        // no Constructor de "new GenericClass<>" !!!
        GenericClass<PersonWithHashcode> genericClass = new GenericClass<>(personWithHashcodeList);
        genericClass.instantiatedObjectListInformation();

        System.out.println("\n");

        PersonWithHashcode personWithHashcode = new PersonWithHashcode("Natália Costa", 33, "Belo Horizonte");

        // O Parâmetro de "getGenericObjectInformation" TAMBÉM é Genérica, então PRECISA ser do MESMO TIPO passado em
        // "GenericClass<>", que nesse caso foi "GenericClass<PersonWithHashcode" !!!
        PersonWithHashcode genericObjectInformation = genericClass.getGenericObjectInformation(personWithHashcode);
        System.out.println("genericObjectInformation: " + genericObjectInformation);

        System.out.println("\n");

        Pizza italianPizza = new Pizza("Italian Pizza", 27.84, false);
        Pizza brazilianPizza = new Pizza("Da Michele", 23.71, false);

        List<Pizza> genericItalianPizzaList = ClassWithOnlyGenericMethod.createGenericList(italianPizza);
        System.out.println("genericItalianPizzaList: " + genericItalianPizzaList);

        List<Pizza> genericBrazilianPizzaList = ClassWithOnlyGenericMethod.createGenericList(brazilianPizza);
        System.out.println("genericBrazilianPizzaList: " + genericBrazilianPizzaList);
    }
}
