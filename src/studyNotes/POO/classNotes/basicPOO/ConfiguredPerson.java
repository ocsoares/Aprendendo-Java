package studyNotes.POO.classNotes.basicPOO;

public class ConfiguredPerson {
    public String name = "Gustavo Souza";
    public int age = 37;
    public String job = "Jardineiro";

    // Também Funciona SEM o "this", mas é Recomendado USAR por Semântica!!!
    public void printConfiguredPerson() {
        System.out.println("ConfiguredPerson name: " + this.name);
        System.out.println("ConfiguredPerson age: " + age);
        System.out.println("ConfiguredPerson job: " + this.job);
    }
}
