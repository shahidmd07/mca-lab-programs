// In the main program, instantiate the classes, add books to the catalog, create users,
// and simulate the borrowing and returning of books. Display the catalog's status aftereach operation.

import java.util.Scanner;
public class P6_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        P3_Catalog catalog = new P3_Catalog();
        P1_Book book1 = new P1_Book(1, "Java Basics", "John Doe", "Programming", true);
        P1_Book book2 = new P1_Book(2, "Advanced Java", "Jane Smith", "Programming", true);
        catalog.add(book1);
        catalog.add(book2);
        P2_User user = new P2_User(1, "Alice"); 
        user.displayUser();

        System.out.println("Initial Catalog:");
        catalog.dispayAvailableBooks();
        System.out.println("\nAlice borrows Book ID 1:");
        user.borrowBook(1);
        catalog.updateBookStatus(1, false);
        catalog.dispayAvailableBooks();
        user.displayUser(); 
 
        sc.close();    
    }
}
