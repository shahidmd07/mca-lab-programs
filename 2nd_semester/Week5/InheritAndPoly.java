import java.util.*;

class Book5 {
    protected int bookId;
    protected String title;
    protected String author;
    protected String genre;
    protected boolean available;
    
    public void input(Scanner sc) {

        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author: ");
        author = sc.nextLine();

        System.out.print("Enter Genre: ");
        genre = sc.nextLine();

        System.out.print("Enter Availability (true/false): ");
        available = sc.nextBoolean();
    }

    public void displayDetails() {

        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + available);
    }
}

class FictionBook extends Book5 {
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Fiction");
    }
}

class NonFictionBook extends Book5 {
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: NonFiction");
    }
}

public class InheritAndPoly {
    public void inheritAndPoly(Scanner sc) {
        while(true) {
            System.out.print("enter the number (1 for FictionBook or 2 for NonFictionBook): ");
            int n = sc.nextInt();
            switch(n) {
                case 1: FictionBook fb = new FictionBook();
                        fb.input(sc);
                        fb.displayDetails();
                    break;
                
                case 2: NonFictionBook nfb = new NonFictionBook();
                        nfb.input(sc);
                        nfb.displayDetails();
                    break;
                
                default: System.out.println("invalid book number! Try again.");
                    break;

            }

            System.out.print("do you want to again knowing the details of fiction book and non fiction book (yes or no): ");
            sc.nextLine();
            String userChoice = sc.nextLine();
            if(userChoice.equals("yes")) {
                continue;
            } else if(userChoice.equals("no")) {
                System.out.println("Thank You!");
                break;
            }
            
        }
    }
}
