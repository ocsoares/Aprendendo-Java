package studyNotes.generics.wildcard;

import studyNotes.collections.setAndHashSet.PersonWithHashcode;

import java.util.ArrayList;
import java.util.List;

// Wildcard = é o "?" passado no TIPO do Parâmetro!!!
public class MainWildcard {
    public static void main(String[] args) {
        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("Pedro Lopes", 24, "São Paulo"));
        workerList.add(new Worker("Luiza Carvalho", 19, "Curitiba"));

        MainWildcard.getPersonListOnlyRead(workerList);

        System.out.println("\n");

        List<PersonWithHashcode> personWithHashcodeList = new ArrayList<>();
        MainWildcard.getPersonListAdd(personWithHashcodeList);
        MainWildcard.getPersonListOnlyRead(personWithHashcodeList);
    }

    // NÃO é possível usar "List<PersonWithHashcode>" porque NÃO vai RECONHECER
    // que, por exemplo, "workerList" e "bankerList" são Classes FILHAS de "PersonWithHashcode" !!!
    // ---------------------------------------------------------------------------------------------------
    // OBS: Usando "List<? extends PersonWithHashcode>" Vai ACEITAR QUALQUER Tipo de Lista que seja
    // "PersonWithHashcode" ou FILHA de "PersonWithHashcode", mas NÃO pode ADICIONAR NADA nessa Lista!!!
    private static void getPersonListOnlyRead(List<? extends PersonWithHashcode> personWithHashcodeList) {
        for (PersonWithHashcode person : personWithHashcodeList) {
            System.out.println("person no getPersonListOnlyRead: " + person);
        }
    }

    // Usando "List<? super PersonWithHashcode>" ACEITA QUALQUER Tipo de Lista que seja "PersonWithHashcode" ou
    // PAI de "PersonWithHashcode", que por PADRÃO no Java é "Object" !!!
    // -----------------------------------------------------------------------------------------------------------
    // OBS: Então, nesse caso, NÃO vai poder usar "workerList" !!!
    private static void getPersonListAdd(List<? super PersonWithHashcode> personWithHashcodeList) {
        personWithHashcodeList.add(new Worker("Jéssica Monteiro", 40, "Goiás"));
        personWithHashcodeList.add(new Worker("Luis Henrique", 21, "Rio Grande do Sul"));

        // Como tem que ITERAR pela Classe mais GENÉRICA, nesse caso, NÃO é "PersonWithHashcode" e sim "Object"
        // que é PAI de "PersonWithHashcode" !!!
        for (Object person : personWithHashcodeList) {
            System.out.println("person no getPersonListAdd: " + person);
        }
    }
}
