package studyNotes.POO.classNotes.enumeration;

// ATRIBUINDO VALORES ao ENUM !!
public enum UserTypeWithValue {
    // Passar os Valores entre () depois do NOME do Atributo do ENUM!!
    COMMON_USER(1, "Usuário comum"),
    ADMIN_USER(2, "Usuário administrador");

    // Atributo PÚBLICO responsável por RETORNAR o Valor escolhido do ENUM!!
    public final int typeUserValue;
    public final String typeUserText;

    // Constructor que será responsável por Atribuir o VALOR conforme o ENUM escolhido, nesse caso,
    // se escolher "COMMON_USER" irá retornar 1, se escolher "ADMIN_USER" irá retornar 2!!!
    // ----------------------------------------------------------------------------------------------
    // OBS: Esse Constructor é PRIVADO, apenas o ENUM pode utilizá-lo!!
    UserTypeWithValue(int typeUserValue, String typeUserText) {
        this.typeUserValue = typeUserValue;
        this.typeUserText = typeUserText;
    }
}
