package pl.sdacademy.algorithms.sort.sorters;

import java.util.Comparator;
import java.util.List;

public class ComparatorBubbleSorter implements ComparatorSorter {
    @Override
    public <T> void sort(List<T> elems, Comparator<T> comparator) {
        for (int i = 0; i < elems.size(); i++) {
            for (int j = 0; j < elems.size() - 1; j++) {
                swapIfNeeded(j, elems, comparator);
            }
        }
    }

    public static <T> void swapIfNeeded(int idx, List<T> elems, Comparator<T> comparator) {
        if (comparator.compare(elems.get(idx), elems.get(idx + 1)) > 0) {
            T tmp = elems.get(idx + 1);
            elems.set(idx + 1, elems.get(idx));
            elems.set(idx, tmp);
        }
    }

}
