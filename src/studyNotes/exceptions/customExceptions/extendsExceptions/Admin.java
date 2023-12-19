package studyNotes.exceptions.customExceptions.extendsExceptions;

import studyNotes.exceptions.customExceptions.InvalidLoginException;

public class Admin extends User {
    // A Classe PAI de Admin (User) declara esse Método "save" com Exceções, mas nas Classes FILHAS
    // NÃO é obrigatório usar essas MESMAS Exceções, Pode NÃO usar NENHUMA ou Usar OUTRAS do MESMO TIPO!!!
    @Override
    public void save() throws InvalidLoginException, ArrayIndexOutOfBoundsException {
        System.out.println("Salvando o Admin !");
    }
}
