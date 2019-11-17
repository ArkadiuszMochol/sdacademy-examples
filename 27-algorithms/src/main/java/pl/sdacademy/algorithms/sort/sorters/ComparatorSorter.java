package pl.sdacademy.algorithms.sort.sorters;

import java.util.Comparator;
import java.util.List;

public interface ComparatorSorter {

    <T> void sort(List<T> elems, Comparator<T> comparator);

}
