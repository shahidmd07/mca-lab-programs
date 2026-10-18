import java.util.*;

public class SquareAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("\nNumber\tSquare\tCube");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.1f\t%.1f\n", i + 1, Math.pow(i+1, 2), Math.pow(i+1, 2)*(i+1));
        }

        sc.close();
    }
}
