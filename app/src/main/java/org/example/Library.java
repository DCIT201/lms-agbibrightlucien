package org.example;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Adding a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Adding a patron to the library
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    // Finding a book by title
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Return null if not found
    }

    // Finding books by an author
    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Library [Books=" + books + ", Patrons=" + patrons + "]";
    }
}

