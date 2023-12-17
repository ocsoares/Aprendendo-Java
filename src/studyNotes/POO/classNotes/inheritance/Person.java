package studyNotes.POO.classNotes.inheritance;

// IMPORTANTE: No Java, os Atributos/Métodos "protected" ficam Disponíveis para as subclasses (óbvio), mas
// TAMBÉM para as Classes do MESMO PACOTE, SEM ter a necessidade de usar "extends" para Herdar!!!!
public class Person {
    private String job;
    private double salary;
    protected String name;
    protected int age;

    public Person() {
    }

    public Person(String job, double salary, String name, int age) {
        this.job = job;
        this.salary = salary;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    protected void getInformation() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("job: " + this.job);
        System.out.println("salary: " + this.salary);
    }
}
