package pl.sdacademy.exercises.books.model;

import java.time.LocalDate;
import java.util.List;

public class Book {
    private String title;
    private String isbn;
    private int pageCount;
    private PublishedDate publishedDate;
    private String thumbnailUrl;
    private String shortDescription;
    private String longDescription;
    private String status;
    private List<String> authors;
    private List<String> categories;

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public LocalDate getPublishedDate() {
        LocalDate date = (publishedDate != null) ? (publishedDate.getDate()) : (null);
        return date;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getStatus() {
        return status;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public List<String> getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        LocalDate printedDate = publishedDate != null ? publishedDate.getDate() : null;

        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pageCount=" + pageCount +
                ", publishedDate=" + printedDate +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", status='" + status + '\'' +
                ", authors=" + authors +
                ", categories=" + categories +
                '}';
    }
}
