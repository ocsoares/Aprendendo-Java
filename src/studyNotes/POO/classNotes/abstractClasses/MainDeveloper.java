package studyNotes.POO.classNotes.abstractClasses;

public class MainDeveloper {
    public static void main(String[] args) {
        // NÃO é possível INSTANCIAR a Classe Abstrata!!!
//        Worker worker = new Worker("Pedro Neves", 23, 2450.82);

        Developer developer = new Developer("Hugo Ribeiro", 33, 8700.21);
        System.out.println(developer);
    }
}
