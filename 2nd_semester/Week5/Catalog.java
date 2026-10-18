import java.util.*;

class CatalogClass {
    private int book_id;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    // setters
    public void setBookId(int id) {
        this.book_id = id;
    }

    public void setTitle(String setTitle) {
        this.title = setTitle;
    }

    public void setAuthor(String setAuthor) {
        this.author = setAuthor;
    }

    public void setGenre(String setGenre) {
        this.genre = setGenre;
    }

    public void setAvailable(boolean setAvailability) {
        this.available = setAvailability;
    }

    // getters
    public int getBookId() {
        return book_id;
    }

    public boolean getAvailable() {
        return available;
    }

    public void printInfo() {
        System.out.print("Book ID: " + book_id);
        System.out.print(", Title: " + title);
        System.out.print(", Author: " + author);
        System.out.print(", Genre: " + genre);
        System.out.print(", Available: " + available);
    }
}


public class Catalog {
    ArrayList<CatalogClass> list = new ArrayList<>();

    public void catalog(Scanner sc) {

        System.out.print("How many books you want to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        // 1️⃣ Add Book Method Call
        for (int i = 0; i < n; i++) {
            addBook(sc);
        }

        // 2️⃣ Display Available Books
        displayAvailableBooks();

        // 3️⃣ Update Book Status
        System.out.print("\nEnter Book ID to update availability: ");
        int id = sc.nextInt();

        System.out.print("Enter new status (true/false): ");
        boolean status = sc.nextBoolean();

        updateBookStatus(id, status);

        System.out.println("\nUpdated Catalog:");
        displayAllBooks();
    }

    // -----------------------------
    // Method 1 → Add Book
    public void addBook(Scanner sc) {

        CatalogClass b1 = new CatalogClass();

        System.out.print("Enter Book ID: ");
        b1.setBookId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Title: ");
        b1.setTitle(sc.nextLine());

        System.out.print("Enter Author: ");
        b1.setAuthor(sc.nextLine());

        System.out.print("Enter Genre: ");
        b1.setGenre(sc.nextLine());

        System.out.print("Enter Availability (true/false): ");
        b1.setAvailable(sc.nextBoolean());
        sc.nextLine();

        list.add(b1);
    }

    // -----------------------------
    // Method 2 → Display Available Books
    public void displayAvailableBooks() {

        System.out.print("\nCatalog: [");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAvailable() == true) {
                list.get(i).printInfo();
                if (i != list.size() - 1) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println("]");
    }

    // -----------------------------
    // Method 3 → Update Book Status
    public void updateBookStatus(int id, boolean status) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getBookId() == id) {
                list.get(i).setAvailable(status);
            }
        }
    }

    // Extra method to show all books
    public void displayAllBooks() {

        System.out.print("Catalog: [");

        for (int i = 0; i < list.size(); i++) {
            list.get(i).printInfo();
            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
