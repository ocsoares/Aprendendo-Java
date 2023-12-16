package studyNotes.POO.classNotes.constructors.howToUse;

public class MainCar {
    public static void main(String[] args) {
        System.out.println("------- CONSTRUCTOR com TRÊS PARÂMETROS ! -------");
        Car car = new Car("Mustang", 2017, "São Paulo");
        car.getInformation();

        System.out.println("\n");

        System.out.println("------- CONSTRUCTOR com DOIS PARÂMETROS ! -------");
        Car car2 = new Car("Gol", 2010);
        car2.getInformation();

        System.out.println("\n");

        System.out.println("------- CONSTRUCTOR com UM PARÂMETRO ! -------");
        Car car3 = new Car("Uno");
        car3.getInformation();

        System.out.println("\n");

        System.out.println("------- CONSTRUCTOR SEM PARÂMETROS ! -------");
        Car car4 = new Car();
        car4.getInformation();
    }
}
