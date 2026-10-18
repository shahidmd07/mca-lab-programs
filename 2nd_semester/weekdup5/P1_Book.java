// You need to design a Book class to represent individual books in the library. The
// class should include attributes such as book ID, title, author, genre, and availability
// status. Implement appropriate methods, including getters and setters

public class P1_Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    public P1_Book() {
    }

    public P1_Book(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }
    public void setBookDetails(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    //Getter
    public int getBookId() {
        return bookId;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    //setter 
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayBookInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        P1_Book book = new P1_Book(1, "Java Basics", "John Doe", "Programming", true);
        book.displayBookInfo();
    }
}
