import java.util.Scanner;

class OddAndEven {
    private int oddCount = 0;
    private int evenCount = 0;

    public void checkNumber(int num) {
        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }

    public int getOddCount() {
        return oddCount;
    }

    public int getEvenCount() {
        return evenCount;
    }
}

public class TestOddAndEven {
    public void test(Scanner sc) {
        OddAndEven obj = new OddAndEven();

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            obj.checkNumber(num);
        }

        System.out.println("Odd count = " + obj.getOddCount());
        System.out.println("Even count = " + obj.getEvenCount());


    }
}
