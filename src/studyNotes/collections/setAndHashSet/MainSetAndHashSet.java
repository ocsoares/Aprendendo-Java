package studyNotes.collections.setAndHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// Usando o "Set" NÃO permite Elementos DUPLICADOS dentro da Coleção!!!
// OBS: Para isso Funcionar, PRECISA ter o "equals" e o "hashcode" na Classe!!
public class MainSetAndHashSet {
    public static void main(String[] args) {
        // O "HashSet" MUDA a Ordem em que Objetos são Inseridos na Collection!!
        Set<PersonWithHashcode> personSetTwo = new HashSet<>();
        personSetTwo.add(new PersonWithHashcode("Fábio Alonso", 25, "Rio de Janeiro"));
        personSetTwo.add(new PersonWithHashcode("Ricardo Neves", 19, "São Paulo"));
        personSetTwo.add(new PersonWithHashcode("Natália Costa", 19, "Belo Horizonte"));

        // Como o "hashcode" dessa Classe está Verificando o Atributo "age", então NÃO TERÃO Objetos
        // DUPLICADOS com o MESMO Atributo "age"!!!
        for (PersonWithHashcode person : personSetTwo) {
            System.out.println("person: " + person);
        }

        System.out.println("\n");

        // Usando "LinkedHashSet" MANTÉM a Ordem em que os Objetos foram inseridos na Collection!!!
        Set<PersonWithHashcode> personSetTwoLinked = new LinkedHashSet<>();
        personSetTwoLinked.add(new PersonWithHashcode("Fábio Alonso", 25, "Rio de Janeiro"));
        personSetTwoLinked.add(new PersonWithHashcode("Ricardo Neves", 19, "São Paulo"));
        personSetTwoLinked.add(new PersonWithHashcode("Natália Costa", 19, "Belo Horizonte"));

        for (PersonWithHashcode person : personSetTwoLinked) {
            System.out.println("person com LinkedHashSet: " + person);
        }

    }
}
