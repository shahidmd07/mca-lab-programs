// Problem 5: Math Class Usage
// Scenario: Develop a module that demonstrates the usage of various methods from the Math class in Java. 
//           The program should showcase at least five different methods (e.g.,Math.abs, Math.sqrt, Math.pow, Math.sin, Math.cos).
          
import java.util.*;

public class MCU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Absolute Value: " + Math.abs(num));
        System.out.println("Square Root: " + (double) Math.sqrt(Math.abs(num)));
        System.out.println("Power: " + Math.pow(num, 2));
        System.out.println("Sine Value: " + (double) Math.sin(num));
        System.out.println("Cosine Value: " + (double) Math.cos(num));

        sc.close();


    }
}
