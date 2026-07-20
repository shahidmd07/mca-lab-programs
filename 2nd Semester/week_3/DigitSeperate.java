import java.util.*;

public class DigitSeperate {
    public void ds(Scanner sc) {
        System.out.print("enter a number: ");
        int num = sc.nextInt();

        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

    }
}
