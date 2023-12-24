package studyNotes.optional;

import java.util.List;
import java.util.Optional;

// Usar o "Optional" quando um Valor pode EXISTIR ou NÃO, usar ele ao invés de um simples "null" !!!
// ----------------------------------------------------------------------------------------------------
// OBS: NÃO é recomendado usar o "Optional" para ATRIBUTOS da Classe ou PARÂMETROS de Métodos!!!
public class MainOptional {
    public static void main(String[] args) {
        Optional<String> checkIfPedroExists = getNameFromTheList("Lucas");
        System.out.println("checkIfPedroExists: " + checkIfPedroExists);

        Optional<String> checkIfVictorExists = getNameFromTheList("Victor");
        System.out.println("checkIfVictorExists: " + checkIfVictorExists);

        String returnSomethingIfNonExists = getNameFromTheList("Fernando").orElse("NÃO ENCONTRADO !!");
        System.out.println("returnSomethingIfNonExists: " + returnSomethingIfNonExists);

        String throwErrorIfNonExists = getNameFromTheList("Henrique").orElseThrow(IllegalArgumentException::new);
        System.out.println("throwErrorIfNonExists: " + throwErrorIfNonExists);
    }

    private static Optional<String> getNameFromTheList(String name) {
        List<String> nameList = List.of("Maria", "Pedro", "Lucas", "João");

        for (String nameValue : nameList) {
            if (nameList.contains(name)) {
                return Optional.of("Nome encontrado!");
            }
        }
        return Optional.empty();
    }
}
