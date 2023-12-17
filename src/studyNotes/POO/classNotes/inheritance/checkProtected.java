package studyNotes.POO.classNotes.inheritance;

// Provando que os Atributos/Métodos "protected" PODEM ser usados por OUTRAS Classes de um MESMO Pacote,
// SEM ter a necessidade de Herdar!!!
public class checkProtected {
    Person person = new Person();

    public void getInformation() {
        person.name = "Name protected";
        person.age = 70;
        person.getInformation();
    }
}
