import java.util.*;

public class Fibonacci {
    public void fibo(Scanner sc) {
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        int i = 1, a = 0, b = 1;
        
        do {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        } while (i <= n);
        System.out.println();
    }
}
