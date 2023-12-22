package studyNotes.collections.queue;

import java.util.Comparator;

public class ProductComparatorByPrice implements Comparator<ProductHashcode> {
    @Override
    public int compare(ProductHashcode o1, ProductHashcode o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
