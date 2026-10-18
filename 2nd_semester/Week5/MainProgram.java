import java.util.*;

class Book {

    private int bookId;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    public Book(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean status) {
        this.available = status;
    }

    public void printBook() {
        System.out.print("Book ID: " + bookId +
                ", Title: " + title +
                ", Author: " + author +
                ", Genre: " + genre +
                ", Available: " + available);
    }
}

// ---------------- Catalog ----------------
class Catalog {

    ArrayList<Book> list = new ArrayList<>();

    public void addBook(Book b) {
        list.add(b);
    }

    public Book searchBook(int id) {
        for (Book b : list) {
            if (b.getBookId() == id) {
                return b;
            }
        }
        return null;
    }

    public void displayCatalog() {
        System.out.print("Catalog: [");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).printBook();
            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

// ---------------- User ----------------
class User {

    private int userId;
    private String name;
    private int borrowedBookId = 0;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void borrowBook(Book b) {
        borrowedBookId = b.getBookId();
        b.setAvailable(false);
    }

    public void returnBook(Book b) {
        borrowedBookId = 0;
        b.setAvailable(true);
    }

    public void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);

        if (borrowedBookId == 0) {
            System.out.println("Borrowed Books: []");
        } else {
            System.out.println("Borrowed Books: [" + borrowedBookId + "]");
        }
    }
}

// ---------------- Main Logic ----------------
public class MainProgram {

    public void run(Scanner sc) {

        Catalog catalog = new Catalog();

        // ---- Add Book ----
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();

        System.out.print("Available (true/false): ");
        boolean available = sc.nextBoolean();
        sc.nextLine();

        Book book = new Book(id, title, author, genre, available);
        catalog.addBook(book);

        catalog.displayCatalog();   // status after adding

        // ---- Create User ----
        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        User user = new User(userId, name);

        // ---- Borrow Book ----
        System.out.print("Enter Book ID to Borrow: ");
        int borrowId = sc.nextInt();

        Book borrowBook = catalog.searchBook(borrowId);

        if (borrowBook != null && borrowBook.isAvailable()) {
            user.borrowBook(borrowBook);
        }

        catalog.displayCatalog();   // status after borrow
        user.displayUser();

        // ---- Return Book ----
        System.out.print("Do you want to return book? (true/false): ");
        boolean returnChoice = sc.nextBoolean();

        if (returnChoice) {
            user.returnBook(borrowBook);
        }

        catalog.displayCatalog();   // status after return
        user.displayUser();
    }
}
