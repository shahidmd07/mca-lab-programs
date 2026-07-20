import java.util.*;

public class SumOfReciprocals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();

        double sum = 0.0;

        for(int i=1; i<=n; i++) {
            sum += (1.0/i);
        }

        System.out.println("Sum of reciprocals from 1 to " + n + " = " + sum);

        sc.close();
    }
}
