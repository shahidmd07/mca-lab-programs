// Problem 3: Temperature Conversion
// Scenario: The system needs a module to convert temperatures from Fahrenheit to Celsius. The
//           formula for conversion is C= F−32/1.8.The result should be displayed in a tabular form.

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int n = sc.nextInt();

        double[] f = new double[n];
        double[] c = new double[n];

        // Taking input only
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextDouble();
            c[i] = (f[i] - 32) / 1.8;
        }

        // Printing table only
        System.out.println("\nS.No\tFahrenheit\tCelsius");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.1f\t\t%.1f\n", i + 1, f[i], c[i]);
        }

        sc.close();
    }
}



