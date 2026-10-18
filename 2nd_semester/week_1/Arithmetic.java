import java.util.*;
public class Arithmetic {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a first number: ");
		int a = sc.nextInt();

		System.out.print("Enter a second number: ");
		int b = sc.nextInt();

		int add = a + b;
		int diff = a - b;
		int prod = a * b;
		int min = Math.min(a, b);
		int max = Math.max(a, b);

		System.out.println("add: " + add);
		System.out.println("diff: " + diff);
		System.out.println("product: " + prod);
		
		if(b != 0) {
			double quotient = (double) a / b;
			System.out.println("Quotient: " + quotient);
		} else {
			System.out.println("Quotient not possible (division by zero): ");
		}

		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	
		sc.close();
		
		
		
	}
}