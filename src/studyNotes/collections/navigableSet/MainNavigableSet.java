package studyNotes.collections.navigableSet;

import studyNotes.collections.sort.sortWithObjects.binarySearch.Person;
import studyNotes.collections.sort.sortWithObjects.binarySearch.PersonComparable;

import java.util.NavigableSet;
import java.util.TreeSet;

// O "NavigableSet" é uma Collection de "sort", que ORGANIZA os Objetos conforme o "compareTo" de
// "Comparable" e tem vários Métodos Relacionados a "sort"!!!
// ----------------------------------------------------------------
// OBS: O "NavigableSet" NÃO permite e RETIRA Elementos DUPLICADOS!!
// ----------------------------------------------------------------
// OBS2: Também pode usar o "Comparator" com o Método "compare" !
public class MainNavigableSet {
    public static void main(String[] args) {
        NavigableSet<PersonComparable> personNavigableByAge = new TreeSet<>();
        personNavigableByAge.add(new PersonComparable("Pedro Lopes", 24, "São Paulo"));
        personNavigableByAge.add(new PersonComparable("Luiza Carvalho", 19, "Curitiba"));
        personNavigableByAge.add(new PersonComparable("Henrique Silva", 24, "Santa Catarina"));
        personNavigableByAge.add(new PersonComparable("Fernando Costa", 31, "Rio de Janeiro"));

        // Nesse caso, o "PersonCompare" compara o "age", então o Objeto com "Henrique Silva" foi RETIRADO,
        // porque tem o "age" REPETIDO (24) !!!
        for (PersonComparable person : personNavigableByAge) {
            System.out.println("personNavigableByAge com COMPARABLE: " + person);
        }

        System.out.println("\n");

        // Comparando com o "Comparator" !!!
        NavigableSet<Person> personNavigableByName = new TreeSet<>(new PersonByNameComparator());
        personNavigableByName.add(new Person("Caio Henrique", 24, "São Paulo"));
        personNavigableByName.add(new Person("Barbára Almeida", 19, "Curitiba"));
        personNavigableByName.add(new Person("Ana Beatriz", 31, "Rio de Janeiro"));

        for (Person person : personNavigableByName) {
            System.out.println("personNavigableByName com COMPARATOR: " + person);
        }

        System.out.println("\n");

        // -------------- MÉTODOS do "NavigableSet" ! --------------

        // "descendingSet" = INVERTE a ORDEM da Collection!
        for (Person person : personNavigableByName.descendingSet()) {
            System.out.println("personNavigableByName DESCENDINGSET: " + person);
        }

        System.out.println("\n");

        // Encontra e RETIRA o PRIMEIRO Elemento da Collection!!
        personNavigableByName.pollFirst();

        for (Person person : personNavigableByName) {
            System.out.println("personNavigableByName com pollFirst: " + person);
        }

        System.out.println("\n");

        // Encontra e RETIRA o ÚLTIMO Elemento da Collection!!
        personNavigableByName.pollLast();

        for (Person person : personNavigableByName) {
            System.out.println("personNavigableByName com pollLast: " + person);
        }

    }
}
