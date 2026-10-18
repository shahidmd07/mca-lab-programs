import java.util.*;

public class Switch5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book p1 = new Book();
        LibraryUser p2 = new LibraryUser();
        Catalog p3 = new Catalog();
        Encapsulations p4 = new Encapsulations();
        InheritAndPoly p5 = new InheritAndPoly();
        // MainProgram p6 = new MainProgram();

        while(true) {
            System.out.print("Enter problem number you want to execute (1-6): ");
            int n = sc.nextInt();
            switch(n) {
                case 1: p1.book(sc);
                    break;

                case 2: p2.user(sc);
                    break;

                case 3: p3.catalog(sc);
                    break;

                case 4: p4.encapsulation(sc);
                    break;

                case 5: p5.inheritAndPoly(sc);
                    break;

                // case 6: p6.run(sc);
                //     break;
                default: System.out.println("Invalid Number! Enter valid problem number");
                    break;
            }    
            sc.nextLine();        

            System.out.print("do you want to again proceed (yes or no): ");
            String userChoice = sc.nextLine();
            if(userChoice.equalsIgnoreCase("yes")) {
                continue;
            } else if(userChoice.equalsIgnoreCase("no")) {
                System.out.println("Thank You!");
                break;
            }

        }
        sc.close();
    }
}
