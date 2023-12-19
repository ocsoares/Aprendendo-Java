package studyNotes.exceptions.customExceptions;

public class MainLoginUser {
    public static void main(String[] args) {
        try {
            LoginUser.login("Fernando Silva", "senha123");
        } catch (InvalidLoginException e) {
            e.printStackTrace();

        }

        System.out.println("\n");

        try {
            LoginUser.login("Alonso Pereira", "alonso123");
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }
}
