package studyNotes.POO.classNotes.methodOverloading;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private String country;

    private char gender;

    public void init(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Isso é a SOBRECARGA de MÉTODOS, em que um MESMO MÉTODO pode ter VÁRIAS Maneiras de
    // ser UTILIZADO, permitindo ter Parâmetros e Retornos DIFERENTES!!!
    // -------------------------------------------------------------------------------------
    // OBS: Isso é muito usado também para Parâmetros OPCIONAIS!!
    public void init(String name, String breed, int age, String country) {
        this.init(name, breed, age);
        this.country = country;
    }

    public void init(String name, String breed, int age, String country, char gender) {
        this.init(name, breed, age, country);
        this.gender = gender;
    }

    public void getInformation() {
        System.out.println("name: " + this.name);
        System.out.println("breed: " + this.breed);
        System.out.println("age: " + this.age);
        System.out.println("country: " + this.country);
        System.out.println("gender: " + this.gender);
    }
}
