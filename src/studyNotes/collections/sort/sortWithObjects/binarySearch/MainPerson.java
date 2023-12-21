package studyNotes.collections.sort.sortWithObjects.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// O binarySearch permite buscar o ÍNDICE de um Objeto em uma LISTA de Objetos!!!
public class MainPerson {
    public static void main(String[] args) {
        List<PersonComparable> personComparableList = new ArrayList<>();
        personComparableList.add(new PersonComparable("Pedro Lopes", 24, "São Paulo"));
        personComparableList.add(new PersonComparable("Luiza Carvalho", 19, "Curitiba"));
        personComparableList.add(new PersonComparable("Fernando Costa", 31, "Rio de Janeiro"));

        Collections.sort(personComparableList);

        for (PersonComparable personComparable : personComparableList) {
            System.out.println("personComparable DEPOIS do sort COMPARABLE pela IDADE: " + personComparable);
        }

        PersonComparable pedroPersonComparableToSearch = new PersonComparable("Pedro Lopes", 24, "São Paulo");

        // Para usar o binarySearch TEM que ORDENAR a Lista ANTES!!
        // OBS: TEM que ser uma Classe FILHA de "Comparable" !!!
        System.out.println(
                "pedroPersonComparableToSearch ÍNDICE ENCONTRADO: " + Collections.binarySearch(
                        personComparableList, pedroPersonComparableToSearch));

        System.out.println("\n");

        // Usando o "binarySearch" com uma Classe NÃO SENDO FILHA de "Comparable"!!!!
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Pedro Lopes", 24, "São Paulo"));
        personList.add(new Person("Luiza Carvalho", 19, "Curitiba"));
        personList.add(new Person("Fernando Costa", 31, "Rio de Janeiro"));

        personList.sort(new PersonByAgeComparator());

        for (Person person : personList) {
            System.out.println("person DEPOIS do sort NÃO COMPARABLE pela IDADE: " + person);
        }

        Person pedroPersonToSearch = new Person("Pedro Lopes", 24, "São Paulo");

        // A diferença aqui é que PRECISA também passar o "Comparator" no ÚLTIMO PARÂMETRO!!
        System.out.println(
                "pedroPersonToSearch ÍNDICE ENCONTRADO: " + Collections.binarySearch(
                        personList, pedroPersonToSearch, new PersonByAgeComparator()));
    }
}
