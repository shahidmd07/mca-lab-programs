// You need to design a User class to represent library users. The class should include
// attributes such as user ID, name, and a list to store borrowed books. Implement
// methods to borrow and return books.

import java.util.ArrayList;
public class P2_User {
    private int userId;
    private String name;
    private ArrayList<Integer> borrowedBooks;
    

    public P2_User(int userId,String name){
        this.userId=userId;
        this.name=name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(int bookId){
        borrowedBooks.add(bookId);
    }
    public void returnBook(int bookId){
        if(!borrowedBooks.contains(bookId)){
            System.out.println("Book ID "+bookId+" was not borrowed.");
        } else {
            borrowedBooks.remove(Integer.valueOf(bookId));
            System.out.println("Book ID "+bookId+" returned successfully.");
        } 
    }

    public void displayUser(){
        System.out.println("User ID: "+userId);
        System.out.println("Name: "+name);
        System.out.println("Borrowed Books: "+borrowedBooks);
    }

    public static void main(String[] args) {
        P2_User user = new P2_User(1, "Alice");
        user.borrowBook(101);
        user.borrowBook(102);
        user.displayUser();
        user.returnBook(101);
        user.displayUser();
        user.returnBook(102);
        user.displayUser();
        user.returnBook(103); 
        user.displayUser();

    }
}
