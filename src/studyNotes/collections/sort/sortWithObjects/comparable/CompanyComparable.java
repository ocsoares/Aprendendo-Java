package studyNotes.collections.sort.sortWithObjects.comparable;

import java.util.Objects;

// Esse "Comparable" permite mostrar para o Java como ORDENAR um Objeto, com qual Atributo, etc.
// ----------------------------------------------------------------------------------------------------
// OBS: Dessa forma, só é possível Comparar UM ATRIBUTO, se quiser Comparar com outro, precisa ALTERAR
// o Código diretamente!!
// ----------------------------------------------------------------------------------------------------
// OBS2: Para Contornar isso, usar o "Comparator", que é uma Classe mais CUSTOMIZÁVEL, pois apenas recebe
// DOIS OBJETOS e Compara os Atributos deles!!
public class CompanyComparable implements Comparable<CompanyComparable> {
    private final String name;
    private final Integer cnpj;
    private final double workersSalary;

    public CompanyComparable(String name, Integer cnpj, double workersSalary) {
        this.name = name;
        this.cnpj = cnpj;
        this.workersSalary = workersSalary;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cnpj=" + cnpj +
                ", workersSalary=" + workersSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompanyComparable companyComparable = (CompanyComparable) o;
        return cnpj == companyComparable.cnpj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj);
    }

    // Explicando pro Java como ORGANIZAR a Lista, do MENOR para o MAIOR!!
    @Override
    public int compareTo(CompanyComparable o) {
        // ------------ Forma mais MANUAl de Implementar o MÉTODO!! ------------
//        // Se o Atributo do Objeto for MENOR que o Atributo COMPARADO, retorna -1
//        if (this.cnpj < o.getCnpj()) {
//            return -1;
//        }
//
//        // Se for IGUAL, retorna 0
//        if (this.cnpj.equals(o.getCnpj())) {
//            return 0;
//        }
//
//        // Se for MAIOR, retorna 1 e ORGANIZA!!!
//        return 1;

        // ------------ Forma mais PRÁTICA de Implementar o MÉTODO!! ------------
        return this.cnpj.compareTo(o.getCnpj());

        // Quando o tipo for PRIMITIVO, usar a Classe WRAPPER desse tipo usando o "compare" !!!
//        return Double.compare(this.workersSalary, o.getWorkersSalary());
    }

    public String getName() {
        return name;
    }

    public double getWorkersSalary() {
        return workersSalary;
    }

    public int getCnpj() {
        return cnpj;
    }
}
