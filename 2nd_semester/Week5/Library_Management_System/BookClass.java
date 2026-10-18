/*Problem 1: Book Class 
You need to design a Book class to represent individual books in the library. 
The class should include attributes such as book ID, title, author, genre, and availability status.
Implement appropriate methods, including getters and setters. 

1. Input: Book ID = 1, Title = "Java Basics", Author = "John Doe", Genre = 
"Programming", Available = true 
Output: 
Book ID: 1 
Title: Java Basics 
Author: John Doe 
Genre: Programming 
Available: true */
public class BookClass {
      protected int bookID;
      protected String title;
      protected String author;
      protected String genre;
      protected boolean available;

      public BookClass(int bookID, String title,String author,String genre,boolean available ){
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.available=available;
      }

      public int getbookID(){
        return bookID;
      }

      public void setbookID(int x){
        bookID=x;
      }

      public String gettitle(){
        return title;
      }

      public void settitle(String str){
        title=str;
      }

      public String getauthor(){
        return author;
      }

      public void setauthor(String str){
        author=str;
      }

      public String getgenre(){
        return genre;
      }

      public void setgenre(String str){
        genre=str;
      }
     public boolean  getavailable(){
        return available;
      }

      public void setavailable(boolean b){
        available=b;
      }
      public void displayDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }
    public static void main(String[] args) {
        BookClass b1= new BookClass(1, "Java Basics", "John Doe", "Programming", true);
   b1.displayDetails();
      }

}
