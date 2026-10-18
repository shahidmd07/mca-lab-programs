// Ensure that proper encapsulation is applied to protect the internal state of the Book 
// and User classes. Use access modifiers to restrict direct access to attributes. 

public class P4_Error {
    public static void main(String[] args) {
        P1_Book book1 = new P1_Book(1, "Java Basics", "John Doe", "Programming", true);
        P2_User user1 = new P2_User(1, "Shahid jii");
        try {
            System.out.println(book1.author);
        } catch (Exception e) {
            System.out.println("Error is: "+e);
        }
        try {
            System.out.println(user1.name);
        } catch (Exception e) {
            System.out.println("Error is: "+e);
        }
    }
}
