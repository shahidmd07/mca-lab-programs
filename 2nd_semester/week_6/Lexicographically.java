import java.util.*;

interface Sorter {
    void sortStrings(String s1, String s2, String s3);
}

class LexicoSorter implements Sorter {
    public void sortStrings(String s1, String s2, String s3) {

        String temp;

        if (s1.compareTo(s2) > 0) {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }

        if (s1.compareTo(s3) > 0) {
            temp = s1;
            s1 = s3;
            s3 = temp;
        }

        if (s2.compareTo(s3) > 0) {
            temp = s2;
            s2 = s3;
            s3 = temp;
        }

        System.out.println("Sorted Strings: " + s1 + ", " + s2 + ", " + s3);
    }
}

public class Lexicographically {

    public void lexicographicallySorting(Scanner sc) {
        // System.out.print("Enter first string: ");
        // String s1 = sc.nextLine();

        // System.out.print("Enter second string: ");
        // String s2 = sc.nextLine();

        // System.out.print("Enter third string: ");
        // String s3 = sc.nextLine();

        Sorter obj = new LexicoSorter();

        // obj.sortStrings(s1, s2, s3);
        obj.sortStrings("Charlie", "Able", "Banker");

        sc.nextLine();

    }
}
