package studyNotes.POO.classNotes.enumeration;

public class MainUser {
    public static void main(String[] args) {
        User user = new User(
                "Breno Almeida", 27, UserType.COMMON_USER, UserTypeWithValue.COMMON_USER,
                UserTypeWithValue.COMMON_USER, UserTypeWithMethods.COMMON_USER_METHOD, "Sou apenas um usuário comum :(",
                User.PaymentType.CREDIT
        );
        System.out.println("user: " + user);

        System.out.println("\n");

        User user2 = new User(
                "Débora Lopes", 19, UserType.ADMIN_USER, UserTypeWithValue.ADMIN_USER,
                UserTypeWithValue.ADMIN_USER, UserTypeWithMethods.ADMIN_USER_METHOD, "Sou o gerente da loja !",
                User.PaymentType.DEBIT
        );
        System.out.println("user2: " + user2);
    }
}
