package studyNotes.exceptions.customExceptions;

public class InvalidLoginException extends Exception {
    // Se não for passado o Constructor, a MENSAGEM PADRÃO vai ser essa!!!
    public InvalidLoginException() {
        super("InvalidLoginException !");
    }

    // Seta a MENSAGEM pelo Constructor!!!
    public InvalidLoginException(String message) {
        super(message);
    }
}
