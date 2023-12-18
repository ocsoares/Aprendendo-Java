package studyNotes.POO.classNotes.interfaces;

public class AmericanBird implements Animal, Bird {

    // Sobrescrevendo esse Método JÁ IMPLEMENTADO Diretamente na Interface!!!
    @Override
    public void drinkWater() {
        System.out.println("O pássaro AMERICANO está bebendo água !");
    }

    @Override
    public void eat() {
        System.out.println("O pássaro AMERICANO está comendo !");
    }

    @Override
    public void sing() {
        System.out.println("O canto do pássaro AMERICANO !");
    }
}
