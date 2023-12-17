package studyNotes.POO.classNotes.inheritance;

// Só é possível extender APENAS UMA Classe (Herança múltipla NÃO é permitida) !!
public class Worker extends Person {
    private String jobDescription;

    public Worker() {

    }

    // HERDANDO o Constructor de "Person" !!
    public Worker(String job, double salary, String name, int age, String jobDescription) {
        super(job, salary, name, age);
        this.jobDescription = jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    // Essa Anotação "@Override" é usada para CONFIRMAR que está SOBRESCREVENDO um Método EXISTENTE, e caso
    // NÃO seja um Método Existente, irá retornar ERRO!!
    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("jobDescription: " + this.jobDescription);
    }

    public void changeNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
