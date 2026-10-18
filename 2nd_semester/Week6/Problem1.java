//  Text Reversal
 import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {

	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter sentence: ");
	String sentence = sc.nextLine();

	
        int start = 0;

        for (int i = 0; i <= sentence.length(); i++) {

            if (i == sentence.length() || sentence.charAt(i) == ' ') {

                for (int j = i - 1; j >= start; j--) {
                    System.out.print(sentence.charAt(j));
                }

                System.out.print(" ");
                start = i + 1;
                sc.close();
            }
        }
    }
}