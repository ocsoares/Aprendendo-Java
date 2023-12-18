package studyNotes.POO.classNotes.abstractClasses;

// Classes Abstratas servem para ser HERDADAS (servem como Molde para outras Classes) logo, NÃO pode
// ser INSTANCIADA!!!
public abstract class Worker {
    protected final String name;
    protected final int age;
    protected final double salary;

    protected Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
