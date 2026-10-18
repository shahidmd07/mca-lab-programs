import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        BookClass b1 = new BookClass(101, "Java Basics", "John Doe", "Programming", true);
        BookClass b2= new BookClass(102, "Advanced Java", "Jane Smith", "Programming", true);
        BookClass b3= new BookClass(103, "Digital", "Dr. Sebha Masood", "Digital Electronics", true);
        BookClass b4= new BookClass(104, "E-commerce", "Dr. Faraz Masood", "Commerce", true);
        BookClass b5= new FictionBookClass(110, "Game of Thrones", "George RR Martin", "Fiction", true);
        BookClass b6= new NonFictionBookClass(115, "Atomic Habits", "James Clear", "Non Fiction", true);
        CatalogClass c1= new CatalogClass();
        
        c1.addBook(b1);
        c1.addBook(b2);
        c1.addBook(b3);
        c1.addBook(b4);
        c1.addBook(b5);
        c1.addBook(b6);
        System.out.println();
        c1.displayBooks();
        System.out.println();

        UserClass Altaf= new UserClass(105, "Altaf Khan");
        UserClass Sumit= new UserClass(127, "Sumit");
        Altaf.borrowbook(101);
        Sumit.borrowbook(110);
        c1.updateBook(101, false);
        c1.updateBook(110, false);
        Altaf.display();
        System.out.println();
        Sumit.display();
        System.out.println();

        c1.displayBooks();
        System.out.println();

        Altaf.returnbook(101);
        c1.updateBook(101, false);
        c1.updateBook(110, false);
        System.out.println();
        Altaf.display();
        System.out.println();
        Sumit.display();
        System.out.println();
        c1.displayBooks();
    }
}
