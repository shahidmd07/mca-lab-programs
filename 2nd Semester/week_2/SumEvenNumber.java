import java.util.*;
public class SumEvenNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your n number: ");
		int n = sc.nextInt();

		int evenSum = 0; 

		for(int i=0; i<n; i++) {
			System.out.print("Enter the digit: ");
			int x = sc.nextInt();
			if(x % 2 == 0) {
				evenSum += x;
			}
		}

		System.out.println("Even Count: " + evenSum);
			
		sc.close();
	}
}