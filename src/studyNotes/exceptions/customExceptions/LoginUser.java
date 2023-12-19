package studyNotes.exceptions.customExceptions;

public class LoginUser {
    private static final String CORRECT_USERNAME = "Alonso Pereira";
    private static final String CORRECT_PASSWORD = "alonso123";

    private LoginUser() {

    }
    
    public static void login(String username, String password) throws InvalidLoginException {
        if (!username.equals(LoginUser.CORRECT_USERNAME) || !password.equals(LoginUser.CORRECT_PASSWORD)) {
            throw new InvalidLoginException("Username or password is invalid !");
        }

        System.out.println("Usuário de nome: " + LoginUser.CORRECT_USERNAME + " logado com sucesso no sistema !");
    }
}
