package studyNotes.streams.flatmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Usar o "flatMap" para Elementos ENCADEADOS !!!
public class MainFlatmap {
    public static void main(String[] args) {
        List<String> developersList = List.of("Maria", "Pedro", "João");
        List<String> bankersList = List.of("Rafael", "Nara", "Roberto");
        List<String> politiciansList = List.of("Bernado", "Guilherme", "Bruno");

        List<List<String>> bigList = new ArrayList<>();
        bigList.add(developersList);
        bigList.add(bankersList);
        bigList.add(politiciansList);

        bigList.forEach(System.out::println);

        // Junta TODAS essas Listas de Strings em uma ÚNICA Lista!!!
        List<String> allStringsList = bigList.stream().flatMap(Collection::stream).toList();
        System.out.println("allStringsList: " + allStringsList);
    }
}
