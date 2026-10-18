import java.util.*;

class Books {
    private int bookId;
    private String title;

    public void setBookId(int id) {
        this.bookId = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public String getTitle() {
        return title;
    }

}

class Users {
    private int userId;
    private String name;

    public void setUserId(int id) {
        this.userId = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

}

public class Encapsulations {
    public void encapsulation(Scanner sc) {

        Books b1 = new Books();
        Users u1 = new Users();

        // Direct Access (Attempt to directly access Book attributes without using getters/setters)
        // b1.bookId = 10;

        // Direct Access (Attempt to directly access User attributes without using getters/setters)
        // u1.userId = 101;

        System.out.println("Compilation Error: Cannot access private attributes directly.");

        b1.setBookId(10);
        u1.setUserId(101);

        System.out.println("Book ID using getter: " + b1.getBookId());
        System.out.println("User ID using getter: " + u1.getUserId());
    }
}