// You are working on a text processing module for a language learning application. 
// The module should read a sentence from the user and print it out with each word 
// reversed, but with the words and punctuation in the original order.

import java.util.Scanner;
public class P1_TextReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence");
        String sentence = sc.nextLine();
        String words[] = sentence.split(" ");

        for(String word :  words){
            for(int i=word.length()-1;i>=0;i--){
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
