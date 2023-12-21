package studyNotes.collections.sort.sortWithObjects.comparator;

import studyNotes.collections.sort.sortWithObjects.comparable.CompanyComparable;

import java.util.ArrayList;
import java.util.List;

public class MainCompanyComparator {
    public static void main(String[] args) {
        List<CompanyComparable> companyList = new ArrayList<>();
        companyList.add(new CompanyComparable("Gás Total", 38524, 4635.57));
        companyList.add(new CompanyComparable("Doce Bom", 13640, 6501.93));
        companyList.add(new CompanyComparable("Água Geral", 75639, 2471.29));

        for (CompanyComparable company : companyList) {
            System.out.println("company ANTES do sort: " + company);
        }

        System.out.println("\n");

        companyList.sort(new CompanyComparatorByName());

        for (CompanyComparable company : companyList) {
            System.out.println("company DEPOIS do sort pelo NAME: " + company);
        }

        System.out.println("\n");

        companyList.sort(new CompanyComparatorByCNPJ());

        for (CompanyComparable company : companyList) {
            System.out.println("company DEPOIS do sort pelo CNPJ: " + company);
        }

        System.out.println("\n");

        companyList.sort(new CompanyComparatorByWorkersSalary());

        for (CompanyComparable company : companyList) {
            System.out.println("company DEPOIS do sort pelo SALÁRIO TRABALHADORES: " + company);
        }

    }
}
