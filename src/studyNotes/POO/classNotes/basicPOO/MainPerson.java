package studyNotes.POO.classNotes.basicPOO;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Felipe Carvalho";
        person.age = 22;
        person.job = "Developer";

        System.out.println("Referência da Classe: " + person);
        System.out.println("Person name SEM MÉTODO: " + person.name);

        person.printPerson(person);

        System.out.println("\n");

        person.printPersonWithThisPropsClass();

        System.out.println("\n");

        person.infoPerson();

        System.out.print("\n");

        person.jobDescription("Developer é um trabalho de programador", 2);

        int futureAge = person.futureAge(10, 30);
        System.out.println("futureAge: " + futureAge);

        boolean isOfLegalAge = person.isOfLegalAge(21);
        System.out.println("isOfLegalAge: " + isOfLegalAge);

        System.out.println("\n");

        ConfiguredPerson configuredPerson = new ConfiguredPerson();

        configuredPerson.printConfiguredPerson();
    }
}
