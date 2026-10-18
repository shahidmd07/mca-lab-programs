import java.util.*;

public class Switch6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TextModule p1 = new TextModule();
        MainProgram p2 = new MainProgram();
        Lexicographically p3 = new Lexicographically();
        ShapeManagement p4 = new ShapeManagement();

        while(true) {
            System.out.print("Enter problem number you want to execute (1-4): ");
            int n = sc.nextInt();
            switch(n) {
                case 1: p1.text(sc);
                    break;

                case 2: p2.multipleInheritance(sc);
                    break;

                case 3: p3.lexicographicallySorting(sc);
                    break;

                case 4: p4.shape(sc);
                    break;

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
