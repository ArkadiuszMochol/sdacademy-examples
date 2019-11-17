package pl.sdacademy.algorithms.sort.sorters;

import pl.sdacademy.algorithms.sort.comparators.BookTitleComparator;
import pl.sdacademy.exercises.books.BooksLoader;
import pl.sdacademy.exercises.books.model.Book;

import java.util.Comparator;
import java.util.List;

public class SorterTest {

    public static void main(String[] args) {
        List<Book> books = BooksLoader.loadBooks("files/books.json");

        Comparator<Book> titleComparator = new BookTitleComparator();
        Comparator<Book> pageCountComparator = (book1, book2) ->
                Integer.compare(book1.getPageCount(), book2.getPageCount());

        Comparator<Book> pageThenTitleComparator = (book1, book2) -> {
            int pageCompareResult = Integer.compare(book1.getPageCount(), book2.getPageCount());
            if (pageCompareResult  == 0) {
                return book1.getTitle().compareTo(book2.getTitle());
            } else {
                return pageCompareResult;
            }
        };

        Comparator<Book> categoryComparator = new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                List<String> book1categories = book1.getCategories();
                List<String> book2categories = book2.getCategories();
                if (book1categories.isEmpty()) return -1;
                if (book2categories.isEmpty()) return 1;
                return book1categories.get(0).compareTo(
                        book2categories.get(0)
                );
            }
        };

//        ComparatorSorter sorter = new ComparatorBubbleSorter();
//        ComparatorSorter sorter = new ComparatorInsertionSorter();
        ComparatorSorter sorter = new ComparatorQuickSorter();

        long startTime = System.nanoTime();

        sorter.sort(books, categoryComparator);

        long stopTime = System.nanoTime();
        double elapsedTime = (stopTime - startTime)/1000000.0;
        System.out.println(String.format("Time for - %f", elapsedTime));

        for (int i = 0; i < books.size(); i++) {
            System.out.println(String.format("Książka: %s, kategorie: %s",
                    books.get(i).getTitle(), books.get(i).getCategories()));
        }
    }

}
