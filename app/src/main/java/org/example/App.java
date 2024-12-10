/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public static void main(String[] args) {
        // Creating an object for the Book class
        Book book = new Book("1984", "George Orwell", 1949);

        // Creating an object for the Patron class
        Patron patron = new Patron("Bless Kofi", "22040340");

        // Creating an object for the Library class
        Library library = new Library();

        // Adding the book to the library
        library.addBook(book);

        // Adding the patron to the library
        library.addPatron(patron);

        // Searching for a book by its title
        System.out.println("Search by title: " + library.findBookByTitle("1984"));

        // Searching for books by author
        System.out.println("Search by author: " + library.findBooksByAuthor("George Orwell"));

        // Displaying all books and patrons
        System.out.println("\nLibrary Details:");
        System.out.println(library);
    }
}


