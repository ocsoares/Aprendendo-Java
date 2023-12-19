package studyNotes.exceptions;

import java.io.IOException;

public class MainBasicException {
    public static void main(String[] args) {
        BasicException.doSomething();

        double division = BasicException.division(10, 0);
        System.out.println("division: " + division);

        try {
            BasicException.justDo();
        } catch (IOException e) {
            System.out.println("Erro de IOException no justDo !");
        }

        BasicException.severalExceptions();
    }
}
