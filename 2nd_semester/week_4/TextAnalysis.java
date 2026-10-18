import java.util.Scanner;

public class TextAnalysis {
    public void text(Scanner sc) {
        sc.nextLine();

        System.out.println("Enter text:");
        String text = sc.nextLine();

        System.out.print("Enter a letter to count: ");
        char ch = sc.next().charAt(0);

        int wordCount = 0;
        int sentenceCount = 0;
        int letterCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount = wordCount + 1; 

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '.' || c == '?') {
                sentenceCount++;
            }
        }

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                letterCount++;
            }
        }

        System.out.println("Number of words = " + wordCount);
        System.out.println("Number of sentences = " + sentenceCount);
        System.out.println("Occurrences of '" + ch + "' = " + letterCount);

    }
}
