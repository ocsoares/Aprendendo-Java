package studyNotes.POO.classNotes.basicPOO;

public class ConfiguredPerson {
    public static final String NAME = "Gustavo Souza";
    public static final int AGE = 37;
    public static final String JOB = "Jardineiro";

    // Também Funciona SEM o "this", mas é Recomendado USAR por Semântica!!!
    public void printConfiguredPerson() {
        System.out.println("ConfiguredPerson name: " + ConfiguredPerson.NAME);
        System.out.println("ConfiguredPerson age: " + ConfiguredPerson.AGE);
        System.out.println("ConfiguredPerson job: " + ConfiguredPerson.JOB);
    }
}
