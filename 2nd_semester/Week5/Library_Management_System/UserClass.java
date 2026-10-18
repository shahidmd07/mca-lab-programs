// Problem 2: User Class 
// Scenario: 
// You need to design a User class to represent library users. The class should include 
// attributes such as user ID, name, and a list to store borrowed books. Implement 
// methods to borrow and return books. 
// Test Cases: 
// 1. Input: User ID = 101, Name = "Alice", Borrow Book ID = 1 
// Output: 
// User ID: 101 
// Name: Alice 
// Borrowed Books: [1] 
import java.util.*;

public class UserClass {

    private int UserID;
    private String Name;
    private List<Integer> BorrowedBookID;

    public UserClass(int UserID, String Name){
        this.UserID=UserID;
        this.Name=Name;
        BorrowedBookID=new ArrayList<>();
    }
    void borrowbook(int bookID){
        BorrowedBookID.add(bookID);
    }
    void returnbook(int bookID){
        BorrowedBookID.remove(Integer.valueOf(bookID));
    }
    public int getUserID(){
        return UserID;
    }
    public void setUserID(int x){
        UserID=x;
    }

    public String getName(){
        return Name;
    }
    public void setName(String str){
        Name=str;
    }
    
    void display(){
        System.out.println("UserID = "+getUserID());
        System.out.println("Name = "+getName());
        System.out.println("BorrowedBookID = "+BorrowedBookID);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        UserClass u1= new UserClass(101, "Nazir");
        int bookID1=sc.nextInt();
        int bookID2=sc.nextInt();
        u1.borrowbook(bookID1);
        u1.borrowbook(bookID2);
        u1.display();
        UserClass u2= new UserClass(102, "Sumit");
        int bookID3=sc.nextInt();
        int bookID4=sc.nextInt();
        u2.borrowbook(bookID3);
        u2.borrowbook(bookID4);
        u2.returnbook(bookID3);
        u2.display();

    }
}

