package studyNotes.POO.classNotes.abstractClasses;

// Classes Abstratas servem para ser HERDADAS (servem como Molde para outras Classes) logo, NÃO pode
// ser INSTANCIADA!!!
// -----------------------------------------
// Estendendo uma Classe Abstrata com OUTRA Classe Abstrata, NÃO precisa Implementar os Métodos nessa
// Classe Abstrata, APENAS nas Classes Filhas CONCRETAS (q NÃO sejam Abstratas) !!!
public abstract class Worker extends Person {
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

    // Usando um Método ABSTRATO em uma Classe ABSTRATA, TODOS as suas Classes Filhas DEVEM Implementar esse
    // Método!!!
    protected abstract void jobDescription();

    // Esse Método vai ser Herdado para as Classes Filhas (ÓBVIO)
    protected void workerMethod() {
        System.out.println("Apenas um método do Worker !!");
    }

}
