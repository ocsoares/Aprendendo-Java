package studyNotes.collections.sort.sortWithObjects.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCompanyComparable {
    public static void main(String[] args) {
        List<CompanyComparable> companyComparableList = new ArrayList<>();
        companyComparableList.add(new CompanyComparable("Negócios Brasil", 60010, 6100.57));
        companyComparableList.add(new CompanyComparable("Frutas Fácil", 20430, 9620.90));
        companyComparableList.add(new CompanyComparable("Luz Geral", 83065, 3480.27));

        for (CompanyComparable companyComparable : companyComparableList) {
            System.out.println("Company ANTES do sort: " + companyComparable);
        }

        System.out.println("\n");

        Collections.sort(companyComparableList);

        for (CompanyComparable companyComparable : companyComparableList) {
            System.out.println("Company DEPOIS do sort: " + companyComparable);
        }
    }
}
