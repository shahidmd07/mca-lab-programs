import java.util.*;

public class SumAndProd {
    public void sumAndProd(Scanner sc) {
        System.out.print("enter how many number you want perform operations: ");
        int n = sc.nextInt();

        int sum = 0, prod = 1;

        for(int i=0; i<n; i++) {
            System.out.print("enter your number: ");
            int x = sc.nextInt();

            sum += x;
            prod *= x;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);

    }
}
