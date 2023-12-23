package studyNotes.generics.genericClass;

import java.util.List;

// Podem ter VÁRIOS Atributos Genéricos, por exemplo, "GenericClass<T, X, Y>" !!
public class GenericClass<T> {
    private final List<T> genericTList;

    public GenericClass(List<T> genericTList) {
        this.genericTList = genericTList;
    }

    public void instantiatedObjectListInformation() {
        for (T t : genericTList) {
            System.out.println("Lista de Objeto INSTANCIADA: " + t);
        }
    }

    public T getGenericObjectInformation(T genericObject) {
        return genericObject;
    }
}
