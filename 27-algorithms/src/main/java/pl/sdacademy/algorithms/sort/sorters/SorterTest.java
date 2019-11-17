package pl.sdacademy.algorithms.sort.sorters;

import pl.sdacademy.algorithms.sort.comparators.BookTitleComparator;
import pl.sdacademy.exercises.books.BooksLoader;
import pl.sdacademy.exercises.books.model.Book;

import java.util.Comparator;
import java.util.List;

public class SorterTest {

    public static void main(String[] args) {
        List<Book> books = BooksLoader.loadBooks("files/books.json");

        Comparator<Book> comparator = new BookTitleComparator();

        ComparatorSorter sorter = new ComparatorBubbleSorter();

        sorter.sort(books, comparator);

        for (int i = 0; i < 10; i++) {
            System.out.println(books.get(i).getTitle());
        }
    }

}
