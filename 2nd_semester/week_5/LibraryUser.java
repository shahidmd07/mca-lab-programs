import java.util.*;

class UserClass {
    private int user_id;
    private String name;
    private int borrowBookId;
    // private int returnBookId;

    UserClass(int id, String name) {
        this.user_id = id;
        this.name = name;
        
    }

    public void borrow(int bookBorrow) {
        this.borrowBookId = bookBorrow;
    }

    public int returnBook() {
        return borrowBookId;
    }

    public void printDetails() {
        System.out.println("User Id: " + user_id);
        System.out.println("Name: " + name);
        System.out.println("Number of Book Borrow: " + borrowBookId);
        System.out.println("Return Book Id: " + returnBook());
    }

}

public class LibraryUser {
    public void user(Scanner sc) {
        System.out.print("enter a user id: ");
        int userId = sc.nextInt();

        sc.nextLine();

        System.out.print("enter a user name: ");
        String userName = sc.nextLine();

        UserClass u1 = new UserClass(userId, userName);

        System.out.print("enter how many book you want to borrow: ");
        u1.borrow(sc.nextInt());

        u1.printDetails();

        


    }
}