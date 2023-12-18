package studyNotes.POO.classNotes.abstractClasses;

public class Developer extends Worker {
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    protected void personMethod() {
        System.out.println("Método da Classe Abstrata PERSON !");
    }

    @Override
    public void jobDescription() {
        System.out.println("Developer de sites e aplicações de internet");
    }
}
