import java.util.*;

public class Switch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TestOddAndEven p1 = new TestOddAndEven();
        CircleClass p2 = new CircleClass();
        TextAnalysis p3 = new TextAnalysis();
        SalesCommission p4 = new SalesCommission();

        while(true) {
            System.out.print("Enter problem number you want to execute (1-4): ");
            int n = sc.nextInt();
            switch(n) {
                case 1: p1.test(sc);
                    break;
                case 2: p2.circle(sc);
                    break;
                case 3: p3.text(sc);
                    break;
                case 4: p4.sales(sc);
                    break;
                default: System.out.println("Invalid Number! Enter valid problem number");
                    break;
            }    
            sc.nextLine();        

            System.out.print("do you want to again proceed (yes or no): ");
            String userChoice = sc.nextLine();
            if(userChoice.equals("yes")) {
                continue;
            } else if(userChoice.equals("no")) {
                System.out.println("Thank You!");
                break;
            }

        }

        sc.close();
        
    }
}