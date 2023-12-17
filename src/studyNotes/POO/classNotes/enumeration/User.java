package studyNotes.POO.classNotes.enumeration;

public class User {
    // Também é possível Declarar um Enum DENTRO da Classe, mas NÃO é muito Recomendado, é melhor usar
    // em um Arquivo SEPARADO!!!
    // --------------------------------------------------------
    // OBS: Também é possível usar SEM NENHUM Modificador de Acesso, apenas passando "enum", logo esse enum
    // poderá ser Acessado por TODAS as CLASSES do MESMO PACOTE!!!
    public enum PaymentType {
        DEBIT,
        CREDIT
    }

    private final String name;
    private final int age;
    private final UserType userType;
    private final UserTypeWithValue userTypeText;
    private final UserTypeWithValue userTypeWithValue;
    private final UserTypeWithMethods userTypeWithMethods;
    private final String userTypePhrase;
    private final PaymentType paymentType;

    public User(
            String name, int age, UserType userType, UserTypeWithValue userTypeText,
            UserTypeWithValue userTypeWithValue,
            UserTypeWithMethods userTypeWithMethods, String userTypePhrase, PaymentType paymentType
    ) {
        this.name = name;
        this.age = age;
        this.userType = userType;
        this.userTypeText = userTypeText;
        this.userTypeWithValue = userTypeWithValue;
        this.userTypeWithMethods = userTypeWithMethods;
        this.paymentType = paymentType;
        this.userTypePhrase = userTypePhrase;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", userType=" + userType +
                ", userTypeText=" + userTypeText.typeUserText +
                ", userTypeWithValue=" + userTypeWithValue.typeUserValue +
                ", userTypeWithMethods=" + userTypeWithMethods.typeUserPhrase(this.userTypePhrase) +
                ", paymentType=" + paymentType +
                '}';
    }
}
