import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Patron> getPatrons() {
        return patrons;
    }

    public void setPatrons(List<Patron> patrons) {
        this.patrons = patrons;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> searchByTitle(String title) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                results.add(book);
            }
        }
        return results;
    }

    public boolean borrowBook(String isbn, Patron patron) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                patron.getBorrowedBooks().add(book);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String isbn, Patron patron) {
        for (Book book : patron.getBorrowedBooks()) {
            if (book.getIsbn().equals(isbn)) {
                book.setAvailable(true);
                patron.getBorrowedBooks().remove(book);
                return true;
            }
        }
        return false;
    }
}
