public class NonFictionBookClass extends BookClass{
    private String genre;

    public NonFictionBookClass(int bookID, String title,String author,String genre,boolean available ){
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
}
