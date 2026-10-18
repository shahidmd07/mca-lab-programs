// Problem 3: Catalog Class 
// Scenario: 
// You need to design a Catalog class to represent the library catalog. The class should 
// use collections (e.g., ArrayList) to store a collection of books. Implement methods 
// to add books to the catalog, display available books, and update book status. 
// Test Cases: 
// 1. Input: Add Book ID = 1, Title = "Java Basics", Author = "John Doe", Genre 
// = "Programming", Available = true 
// Output: 
// Catalog: [Book ID: 1, Title: Java Basics, Author: John Doe, Genre: 
// Programming, Available: true] 
import java.lang.reflect.Array;
import java.util.*;
public class CatalogClass {
    private ArrayList<BookClass>collection;
    
    public CatalogClass(){
        collection= new ArrayList<>();
    }  
    public void addBook(BookClass book)
    {
        collection.add(book);
        System.out.println(book.getbookID()+" added Succesfully.");
    }

    public void displayBooks(){
        System.out.println("Available Books: ");
        for(int i=0;i<collection.size();i++){
            BookClass b=collection.get(i);
            if(b.getavailable()){
                System.out.println("BookID= "+b.getbookID());
                System.out.println("Yes, it is Available. ");
                System.out.println("Title= "+b.gettitle());
                System.out.println("Genre= "+b.getgenre());
                System.out.println("Author= "+b.getauthor());
            }
            }
        }

    public void updateBook(int bookID,boolean available){
        for(int i=0;i<collection.size();i++){
            BookClass b= collection.get(i);
            if(b.getbookID()==bookID){
               b.setavailable(available);
               System.out.println(bookID+ " updated Succesfully.");
               return;
            }
        }
          System.out.println("Book Not Found.");
        }
    
    public static void main(String[] args) {
        BookClass b1=new BookClass(101, "Java Basics", "John Doe", "Programming", true);
        BookClass b2= new BookClass(102, "Advanced Java", "Jane Smith", "Programming", true);
        BookClass b3= new BookClass(103, "Digital", "Dr. Sebha Masood", "Digital Electronics", true);
        BookClass b4= new BookClass(104, "E-commerce", "Dr. Faraz Masood", "Commerce", true);

        UserClass Altaf= new UserClass(105, "Altaf Khan");
        UserClass Sumit= new UserClass(127, "Sumit");

        CatalogClass c1= new CatalogClass();
        
        c1.addBook(b1);
        c1.addBook(b2);
        c1.addBook(b3);
        c1.addBook(b4);
        System.out.println();
        c1.displayBooks();
        System.out.println();
        Altaf.borrowbook(103);
        Altaf.display();
        System.out.println();
        c1.updateBook(103, false);
        System.out.println();
        c1.displayBooks();
        System.out.println();  
        c1.addBook(b3);
        c1.updateBook(103, true);
        System.out.println();
        c1.displayBooks();       
    }
}
