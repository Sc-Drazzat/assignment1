package assignment;

import java.util.Scanner;
import java.util.ArrayList;

public class LibraryApp {
    private ArrayList<Book> books = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void run() {
        System.out.println("Welcome to Library App!");
        while (true) {
            System.out.println("1. Print all books");
            System.out.println("2. Add new book");
            System.out.println("3. Search books by title");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Delete a book by id");
            System.out.println("7. Quit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    printAllBooks();
                    break;
                case 2:
                    addNewBook();
                    break;
                case 3:
                    searchBooksByTitle();
                    break;
                case 4:
                    borrowBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    deleteBook();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    private Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
    private void printAllBooks() {
        if (books.isEmpty())
            System.out.println("No books in the library!");
        else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private void addNewBook() {
        System.out.println("Enter title: ");
        String title = input.nextLine();

        System.out.println("Enter author: ");
        String author = input.nextLine();

        System.out.println("Enter year: ");
        int year = input.nextInt();
        input.nextLine();

        Book book = new Book(title, author, year);
        books.add(book);
    }

    private void searchBooksByTitle() {
        System.out.println("Enter title: ");
        String title = input.nextLine().toLowerCase();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title)) {
                System.out.println(book);
            }
        }
    }

    private void borrowBook() {
        System.out.println("Enter id:");
        int id = input.nextInt();
        input.nextLine();
        Book book = findBookById(id);
        if (book.isAvailable()) {
            book.markAsBorrowed();
        } else {
            System.out.println("The book is already borrowed");
        }
    }

    private void returnBook() {
        System.out.println("Enter id:");
        int id = input.nextInt();
        input.nextLine();
        Book book = findBookById(id);
        if (!book.isAvailable() && book != null) {
            book.markAsReturned();
        }
    }

    private void deleteBook() {
        System.out.println("Enter id:");
        int id = input.nextInt();
        input.nextLine();
        Book book = findBookById(id);
        if (book != null) {
            books.remove(book);
        } else {
            System.out.println("Book not found");
        }
    }

    public static void main(String[] args) {
        new LibraryApp().run();
    }
}