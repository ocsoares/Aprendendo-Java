package studyNotes.POO.classNotes;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Felipe Carvalho";
        person.age = 22;
        person.job = "Developer";

        System.out.println("Referência da Classe: " + person);
        System.out.println("Person name: " + person.name);
        System.out.println("Person age: " + person.age);
        System.out.println("Person job: " + person.job);

        System.out.println("\n");

        person.infoPerson();

        System.out.print("\n");

        person.jobDescription("Developer é um trabalho de programador", 2);

        int futureAge = person.futureAge(10, 30);
        System.out.println("futureAge: " + futureAge);

        boolean isOfLegalAge = person.isOfLegalAge(21);
        System.out.println("isOfLegalAge: " + isOfLegalAge);

        System.out.println("Test");
    }
}
