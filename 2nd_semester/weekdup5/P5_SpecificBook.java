// Utilize inheritance to create a more specific type of book (e.g., FictionBook,
// NonFictionBook) that extends the base Book class. Demonstrate polymorphism
// through a method like displayDetails() that can provide different information basedon the book type.
enum BookType {Fiction,NonFiction};
public class P5_SpecificBook extends P1_Book {
    private BookType bookType;

    P5_SpecificBook(int bookId,String title, String author,String genre, boolean isAvailable, BookType bt){
        super(bookId, title, author, genre, isAvailable);
        this.bookType=bt;
    }

    P5_SpecificBook(){}
    public void setBookDetails(int bookId, String title, String author, String genre, boolean isAvailable, BookType bt) {
        super.setBookDetails(bookId, title, author, genre, isAvailable);
        this.bookType =bt;
    }
    
    BookType getBookType(){
        return bookType;
    }
    void setBookType(BookType bt){
        this.bookType = bt;
    }
    public void displayBookInfo() {
        System.out.println("Book ID: " + getBookId());
        System.out.println("Book Type: "+ bookType);
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + getGenre());
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        P5_SpecificBook book1 = new P5_SpecificBook(1, "Fiction Book", "Fiction Author", "Fiction", true, BookType.Fiction);
        P5_SpecificBook book2 = new P5_SpecificBook(2, "Non-Fiction Book", "Non-Fiction Author", "Non-Fiction", true, BookType.NonFiction);
        
        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();

        P5_SpecificBook book3 = new P5_SpecificBook();
        book3.setBookDetails(3, "Fiction Book3", "Fiction Author3", "Fiction", true, BookType.Fiction);
        book3.displayBookInfo();
        System.out.println("");

        P5_SpecificBook book4 = new P5_SpecificBook();
        book4.setBookDetails(4, "Fiction Book4", "Fiction Author4", "Fiction", true, BookType.Fiction);
        book4.displayBookInfo();
        
    }
}
