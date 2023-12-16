package studyNotes.POO.classNotes.methodOverloading;

public class MainCat {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println("------- TRÊS PARÂMETROS ! -------");
        cat.init("Luna", "Angorá", 4);
        cat.getInformation();

        System.out.println("\n");

        System.out.println("------- QUATRO PARÂMETROS ! -------");
        cat.init("Tico", "Persa", 12, "United States");
        cat.getInformation();

        System.out.println("\n");

        System.out.println("------- CINCO PARÂMETROS ! -------");
        cat.init("Sofia", "Himalaya", 7, "Brazil", 'F');
        cat.getInformation();
    }
}
