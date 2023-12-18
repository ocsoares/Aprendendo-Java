package studyNotes.POO.classNotes.interfaces;

// Usar "implements" para Implementar INTERFACES, ao invés de "extends" que é usado em Classes Abstratas!!!
// -----------------------------------------------------------------------------------------------------------
// Ao contrário de usar Classes Abstratas (extends), usando Interfaces PODE Implementar VÁRIAS Interfaces!!!
public class BrazilianBird implements Animal, Bird {
    // NÃO é possível Sobrescrever Métodos STATIC da Interface!!!
//     @Override
//    public void staticDrinkWater() {
//        System.out.println("O pássaro BRASILEIRO STATIC está bebendo água !");
//    }

    @Override
    public void eat() {
        System.out.println("O pássaro BRASILEIRO está comendo !");
    }

    @Override
    public void sing() {
        System.out.println("O canto do pássaro BRASILEIRO !");
    }
}
