// You need to design a Catalog class to represent the library catalog. The class should
// use collections (e.g., ArrayList) to store a collection of books. Implement methods
// to add books to the catalog, display available books, and update book status

import java.util.ArrayList;

public class P3_Catalog {
    private ArrayList<P1_Book> books;
    P3_Catalog(){
        this.books = new ArrayList<>();
    }

    public void add(P1_Book book){
        books.add(book);
    }
    public void dispayAvailableBooks(){
        System.out.println("Available Books: ");
        for(int i=0;i<books.size();i++){
           // if(books.get(i).isAvailable()==true){
                System.out.println("Book ID: " + books.get(i).getBookId());
                System.out.println("Title: " + books.get(i).getTitle());
                System.out.println("Author: " + books.get(i).getAuthor());
                System.out.println("Genre: " + books.get(i).getGenre());
                System.out.println("Available: " + books.get(i).isAvailable());
           // }
        }
    }
    public void updateBookStatus(int bookId,boolean availability){
        for(int i=0;i<books.size();i++){
            if(books.get(i).getBookId()==bookId){
                books.get(i).setAvailable(availability);
            }
        }  
    }
    public static void main(String[] args) {
        P3_Catalog catalog = new P3_Catalog();
        P1_Book book1 = new P1_Book(1, "Java Basics", "John Doe", "Programming", true);
        P1_Book book2 = new P1_Book(2, "Advanced Java", "Jane Smith", "Programming", false);
        catalog.add(book1);
        catalog.add(book2);
        catalog.dispayAvailableBooks();
        System.out.println();
        catalog.updateBookStatus(1, false);
        catalog.dispayAvailableBooks();
    }
}
