package studyNotes.collections.sort.sortWithObjects.comparator;

import studyNotes.collections.sort.sortWithObjects.comparable.CompanyComparable;

import java.util.Comparator;

public class CompanyComparatorByName implements Comparator<CompanyComparable> {
    @Override
    public int compare(CompanyComparable o1, CompanyComparable o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
