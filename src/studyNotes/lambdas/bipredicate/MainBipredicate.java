package studyNotes.lambdas.bipredicate;

import java.util.List;
import java.util.function.BiPredicate;

public class MainBipredicate {
    public static void main(String[] args) {
        List<String> nameList = List.of("Pedro", "Maria", "Alvares", "Hugo", "João");

        BiPredicate<List<String>, String> checkIfNameExists = List::contains;
        boolean isNameExists = checkIfNameExists.test(nameList, "Alvares");
        System.out.println("isNameExists: " + isNameExists);

        boolean isNameExistsTwo = checkIfNameExists.test(nameList, "Guilherme");
        System.out.println("isNameExistsTwo: " + isNameExistsTwo);
    }
}
