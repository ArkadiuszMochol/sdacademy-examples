package pl.sdacademy.exercises.books;

import com.google.common.collect.Lists;
import pl.sdacademy.exercises.books.model.Book;

import java.util.*;
import java.util.stream.Collectors;

public class BooksTest {

    public static void main(String[] args) {
        List<Book> books = BooksLoader.loadBooks("files/books.json");
        System.out.println(books.size());

        //books.stream().map(Book::getTitle).forEach(System.out::println);

        //showAuthors(books, 100);
//        List<Book> javaBooks = getBooksForCategory(books, "Java");
//
//        for (Book book : javaBooks) {
//            System.out.println(String.format("Książka %s ma kategorie %s",
//                book.getTitle(), book.getCategories()));
//        }

//        System.out.println("Liczba autorów w książkach (używając Set): "
//                + getAuthorsCountUsingSet(books));
//        System.out.println("Liczba autorów w książkach (używając List): "
//                + getAuthorsCountUsingList(books));

//        List<Book> armstrongsBooks = getBooksForAuthor(books, "Peter Armstrong");
//        for (Book book : armstrongsBooks) {
//            System.out.println(String.format("Książka %s ma autorów %s",
//                book.getTitle(), book.getAuthors()));
//        }
    }

    // zadanie 2
    public static void showAuthors(List<Book> books, int minPageCount) {
        for (Book book : books) {
            if (book.getPageCount() > minPageCount) {
                System.out.println(String.format("Książka %s ma %d stron",
                        book.getTitle(), book.getPageCount()));
            }
        }
    }

    public static void showAuthorsStream(List<Book> books, int minPageCount) {
        books.stream().filter(book -> book.getPageCount() > minPageCount)
                .forEach(book -> System.out.println(String.format("Książka %s ma %d stron",
                        book.getTitle(), book.getPageCount())));
    }

    // zadanie 5
    public static List<Book> getBooksForCategory(List<Book> books, String category) {
        List<Book> booksForCategory = new ArrayList<>();
        for (Book book : books) {
            if (book.getCategories().contains(category)) {
                booksForCategory.add(book);
            }
        }
        return booksForCategory;
    }

    public static List<Book> getBooksForCategoryStream(List<Book> books, String category) {
        return books.stream().filter(book -> book.getCategories().contains(category))
                .collect(Collectors.toList());
    }

    // zadanie 3
    public static int getAuthorsCountUsingSet(List<Book> books) {
        Set<String> authors = new HashSet<>();
        for (Book book : books) {
            authors.addAll(book.getAuthors());
        }
        return authors.size();
    }

    public static int getAuthorsCountUsingList(List<Book> books) {
        List<String> authors = new ArrayList<>();
        for (Book book : books) {
            for (String author : book.getAuthors()) {
                if (!authors.contains(author)) {
                    authors.add(author);
                }
            }
        }
        return authors.size();
    }

}
