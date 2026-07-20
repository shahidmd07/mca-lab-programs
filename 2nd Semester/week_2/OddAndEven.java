import java.util.*;
public class OddAndEven {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your n number: ");
		int n = sc.nextInt();

		int even = 0, odd = 0; 

		for(int i=0; i<n; i++) {
			System.out.print("Enter the digit: ");
			int x = sc.nextInt();
			if(x % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		System.out.println("Even Count: " + even);
		System.out.println("Odd Count: " + odd);
			
		sc.close();	
	}
}