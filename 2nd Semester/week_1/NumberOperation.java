// Problem 4: Number Operations
// Scenario: You are required to write a program that performs various operations on a double variable num. 
//           The operations include finding the round, ceil, floor values, and casting to an integer.
import java.util.*;

public class NumberOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double num = sc.nextDouble();

        System.out.println("Original Value = " + num);
       

	int val = (int) num;
	if((num-val) >= 0.5) {
		System.out.println("Round Value = " + (double)(val+1.0));
	}
	
    	
	if((num-val) >= 0.5) {
		System.out.println("Ceil Value = " + (double)(val+1));
	} 

	System.out.println("Floor Value = " + (double) val);

	System.out.println("Integer Value = " + (int) num);

        sc.close();
    }
}
