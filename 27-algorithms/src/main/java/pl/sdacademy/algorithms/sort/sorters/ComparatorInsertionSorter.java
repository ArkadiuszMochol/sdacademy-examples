package pl.sdacademy.algorithms.sort.sorters;

import java.util.Comparator;
import java.util.List;

public class ComparatorInsertionSorter implements ComparatorSorter {

    @Override
    public <T> void sort(List<T> elems, Comparator<T> comparator) {
        for (int i = 1; i < elems.size(); i++) {
            T insertedElem = elems.get(i);
            int j = i - 1;
            while(j >= 0 && comparator.compare(elems.get(j), insertedElem) > 0) {
                elems.set(j + 1, elems.get(j));
                j = j - 1;
            }
            elems.set(j + 1, insertedElem);
        }
    }
}
