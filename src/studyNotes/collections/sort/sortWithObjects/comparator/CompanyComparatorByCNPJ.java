package studyNotes.collections.sort.sortWithObjects.comparator;

import studyNotes.collections.sort.sortWithObjects.comparable.CompanyComparable;

import java.util.Comparator;

public class CompanyComparatorByCNPJ implements Comparator<CompanyComparable> {
    @Override
    public int compare(CompanyComparable o1, CompanyComparable o2) {
        return Integer.compare(o1.getCnpj(), o2.getCnpj());
    }
}
