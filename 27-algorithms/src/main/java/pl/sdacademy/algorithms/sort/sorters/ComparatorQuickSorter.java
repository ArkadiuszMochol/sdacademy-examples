package pl.sdacademy.algorithms.sort.sorters;

import java.util.Comparator;
import java.util.List;

public class ComparatorQuickSorter implements ComparatorSorter {
    @Override
    public <T> void sort(List<T> elems, Comparator<T> comparator) {
        quickSort(elems, comparator, 0, elems.size() - 1);
    }

    private <T> void quickSort(List<T> elems, Comparator<T> comparator, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(elems, comparator, begin, end);

            quickSort(elems, comparator, begin, partitionIndex - 1);
            quickSort(elems, comparator, partitionIndex + 1, end);
        }
    }

    private <T> int partition(List<T> elems, Comparator<T> comparator, int begin, int end) {
        T pivot = elems.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (comparator.compare(elems.get(j), pivot) <= 0) {
                i++;
                T swapTemp = elems.get(i);
                elems.set(i, elems.get(j));
                elems.set(j, swapTemp);
            }
        }

        T swapTemp = elems.get(i + 1);
        elems.set(i + 1, elems.get(end));
        elems.set(end, swapTemp);

        return i + 1;
    }
}
