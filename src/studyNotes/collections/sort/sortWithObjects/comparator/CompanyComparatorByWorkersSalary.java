package studyNotes.collections.sort.sortWithObjects.comparator;

import studyNotes.collections.sort.sortWithObjects.comparable.CompanyComparable;

import java.util.Comparator;

public class CompanyComparatorByWorkersSalary implements Comparator<CompanyComparable> {
    @Override
    public int compare(CompanyComparable o1, CompanyComparable o2) {
        return Double.compare(o1.getWorkersSalary(), o2.getWorkersSalary());
    }
}
