package studyNotes.generics.genericClass;

import java.util.List;

public class ClassWithOnlyGenericMethod {

    // O "<T>" CRIA o Atributo GENÉRICO !!
    // -----------------------------------------
    // O "T" DEPOIS do "<T>" é o RETORNO do Método !!

    public static <T> List<T> createGenericList(T genericObject) {
        return List.of(genericObject);
    }
}
