import java.util.*;

public class DigitCombination {
    public void dc(Scanner sc) {
        System.out.print("enter a first number: ");
        int a = sc.nextInt();

        System.out.print("enter a second number: ");
        int b = sc.nextInt();

        System.out.print("enter a third number: ");
        int c = sc.nextInt();
        
        String s = "" + a + b + c;
        String printed = "";

        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = 0; j < s.length(); j++) {
        //         for (int k = 0; k < s.length(); k++) {

        //             if (i != j && j != k && i != k) {
        //                 System.out.println("" + s.charAt(i) + s.charAt(j) + s.charAt(k));
        //             }
        //         }
        //     }
        // }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < s.length(); k++) {

                    if (i != j && j != k && i != k) {
                        String temp = "" + s.charAt(i) + s.charAt(j) + s.charAt(k);
                        if(!printed.contains(temp)) {
                            System.out.println(temp);
                            printed = printed + temp + " ";
                        }
                    }
                }
            }
        }

    }
}
