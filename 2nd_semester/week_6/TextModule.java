import java.util.*;


interface TextProcessor {
    String processText(String text);
}

class ReverseText implements TextProcessor {

    @Override
    public String processText(String text) {

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            StringBuilder reversed = new StringBuilder(word);
            reversed.reverse();

            result.append(reversed).append(" ");
        }

        return result.toString().trim();
    }
}

public class TextModule {
    public void text(Scanner sc) {
        TextProcessor tp = new ReverseText();  

        sc.nextLine();

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String result = tp.processText(input);

        System.out.println("Output: " + result);
    }
}

