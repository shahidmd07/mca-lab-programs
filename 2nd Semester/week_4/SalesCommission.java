import java.util.*;

public class SalesCommission {
    public void sales(Scanner sc) {

        System.out.print("Enter sales amount: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
        } else if (n < 500) {
            double commission = (n * 2.0) / 100;
            System.out.println("Commission: " + commission);
        } else if (n < 5000) {
            double commission = (n * 5.0) / 100;
            System.out.println("Commission: " + commission);
        } else {
            double commission = (n * 8.0) / 100;
            System.out.println("Commission: " + commission);
        }

    }
}