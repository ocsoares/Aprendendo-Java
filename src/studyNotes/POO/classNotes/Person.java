package studyNotes.POO.classNotes;

public class Person {
    public String name;
    public int age;
    public String job;

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