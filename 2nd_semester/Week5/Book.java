import java.util.*;

class BookClass {
    private int book_id;
    private String title;
    private String author;
    private String genre;
    private boolean available;

    // setters
    public void setBookId(int bookId) {
        this.book_id = bookId;
    }

    public void setTitle(String title_name) {
        this.title = title_name;
    }

    public void setAuthor(String author_name) {
        this.author = author_name;
    }

    public void setGenre(String genre_name) {
        this.genre = genre_name;
    }

    public void setAvailable(boolean availability) {
        this.available = availability;
    }

    // getters
    public int getBookId() {
        return book_id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean getAvailability() {
        return available;
    }

    public void prinInfo() {
        System.out.println("Book Id: " + getBookId());
        System.out.println("Author: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + getGenre());
        System.out.println("Availability: " + getAvailability());
    }

    // public void detail(String title, String author) {
    //     title = this.title;
    //     author = this.author;
    // }

    // public void printDetail() {
    //     System.out.println(title);
    //     System.out.println(author);
    // }
}

public class Book {
    public void book(Scanner sc) {
        BookClass b1 = new BookClass();
        System.out.print("Enter a Book Id: ");
        b1.setBookId(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter a Title Name: ");
        b1.setTitle(sc.nextLine());

        System.out.println("Enter a Author Name: ");
        b1.setAuthor(sc.nextLine());

        System.out.println("Enter a Genre Name: ");
        b1.setGenre(sc.nextLine());

        System.out.println("Enter a Availability of Book in (True or False): ");
        b1.setAvailable(sc.nextBoolean());

        System.out.println("Book Details: ");
        b1.prinInfo();

    }
}
