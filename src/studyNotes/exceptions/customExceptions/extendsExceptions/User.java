package studyNotes.exceptions.customExceptions.extendsExceptions;

import studyNotes.exceptions.customExceptions.InvalidLoginException;

public class User {

    public void save() throws InvalidLoginException, IllegalArgumentException {
        System.out.println("Salvando o User !");
    }
}