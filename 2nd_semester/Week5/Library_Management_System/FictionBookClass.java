public class FictionBookClass extends BookClass {
    private String genre;

    public FictionBookClass (int bookID, String title,String author,String genre,boolean available ){
        super(bookID, title, author, genre, available);
        this.genre=genre;
    }

    public void displayDetails()
    {
        System.out.println("Fiction Book Class: ");
        System.out.println("BookID ="+bookID);
        System.out.println("Title ="+title);
        System.out.println("Author ="+author);
        System.out.println("Genre ="+genre);
        System.out.println("Available ="+available);
    }
    public static void main(String[] args) {
        BookClass b1= new FictionBookClass(110, "Game of Thrones", "George RR Martin", "Fiction", true);
        b1.displayDetails();
    }
}
