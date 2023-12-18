package studyNotes.POO.classNotes.interfaces;

public class MainBird {
    public static void main(String[] args) {
        // NÃO é possível Instanciar INTERFACES !!!
//        Bird bird = new Bird();

        BrazilianBird brazilianBird = new BrazilianBird();
        Bird.staticDrinkWater();
        brazilianBird.drinkWater();
        brazilianBird.eat();
        brazilianBird.sing();
        System.out.println("Idade do pássaro BRASILEIRO: " + Bird.age);

        System.out.println("\n");

        AmericanBird americanBird = new AmericanBird();
        Bird.staticDrinkWater();
        americanBird.drinkWater();
        americanBird.eat();
        americanBird.sing();
        System.out.println("Idade do pássaro AMERICANO: " + Bird.age);
    }
}
