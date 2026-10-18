import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fibonacci p1 = new Fibonacci();
        DigitCombination p2 = new DigitCombination();
        SumAndProd p3 = new SumAndProd();
        DigitSeperate p4 = new DigitSeperate();

        while(true) {
            System.out.print("Enter problem number you want to execute (1-5): ");
            int n = sc.nextInt();
            switch(n) {
                case 1: p1.fibo(sc);
                    break;
                case 2: p2.dc(sc);
                    break;
                case 3: p3.sumAndProd(sc);
                    break;
                case 4: p4.ds(sc);
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
