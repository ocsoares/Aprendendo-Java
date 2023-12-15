package studyNotes.POO.classNotes.basicPOO;

public class Person {
    public String name;
    public int age;
    public String job;

    public void printPerson(Person person) {
        System.out.println("Person name: " + person.name);
        System.out.println("Person age: " + person.age);
        System.out.println("Person job: " + person.job);
    }

    // Isso também FUNCIONA, pois usa as Propriedades do Classe INSTANCIADA!!
    public void printPersonWithThisPropsClass() {
        System.out.println("Person this.name: " + this.name);
        System.out.println("Person this.age: " + this.age);
        System.out.println("Person this.job: " + this.job);
    }

    public void infoPerson() {
        System.out.println("Apenas uma descrição qualquer da classe Person !");
    }

    public void jobDescription(String description, int yearsOnTheJob) {
        System.out.println("Descrição do trabalho: " + description);
        System.out.println("Anos nesse trabalho: " + yearsOnTheJob);
    }

    public int futureAge(int currentAge, int futureAge) {
        return currentAge + futureAge;
    }

    public boolean isOfLegalAge(int age) {
        return age >= 18;
    }
}