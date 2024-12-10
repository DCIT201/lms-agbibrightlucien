/*
 * This should be your main class where all your objects will be created
 */
package org.example;
public class App {
    public static void main(String[] args) {
        // Create a library object
        Library library = new Library();

        // Add books to the library
        Book book1 = new Book("Java Programming", "John Doe", "123456", true);
        Book book2 = new Book("Data Structures", "Jane Smith", "789101", true);
        library.addBook(book1);
        library.addBook(book2);

        // Create a patron
        Patron patron = new Patron("Bright", "P001");

        // Borrow a book
        boolean borrowSuccess = library.borrowBook("123456", patron);
        if (borrowSuccess) {
            System.out.println(patron.getName() + " successfully borrowed the book: " + book1.getTitle());
        } else {
            System.out.println("The book is not available for borrowing.");
        }

        // Display borrowed books
        System.out.println("Books borrowed by " + patron.getName() + ":");
        for (Book book : patron.getBorrowedBooks()) {
            System.out.println("- " + book.getTitle());
        }

        // Return a book
        boolean returnSuccess = library.returnBook("123456", patron);
        if (returnSuccess) {
            System.out.println(patron.getName() + " successfully returned the book: " + book1.getTitle());
        } else {
            System.out.println("Failed to return the book.");
        }
    }
}


