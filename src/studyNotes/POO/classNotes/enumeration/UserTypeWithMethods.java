package studyNotes.POO.classNotes.enumeration;

// Métodos com ENUM!!!
public enum UserTypeWithMethods {
    // Colocar entre {} o MÉTODO do Atributo do ENUM!!!
    COMMON_USER_METHOD {
        @Override
        public String typeUserPhrase(String phrase) {
            return "COMMON_USER Phrase: " + phrase;
        }
    },
    ADMIN_USER_METHOD {
        @Override
        public String typeUserPhrase(String phrase) {
            return "ADMIN_USER Phrase: " + phrase;
        }
    };

    // RECOMENDADO: Usar Classe Abstrata como MOLDE para os Métodos poderem usar da sua PRÓPRIA MANEIRA (Override) !!!
    public abstract String typeUserPhrase(String phrase);
}
