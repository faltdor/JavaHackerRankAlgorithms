package main.java.master.clazz.faltdor.Algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger total = new BigInteger(String.valueOf(n));
        for (int i = n-1; i > 0; i--) {
            total = total.multiply(BigInteger.valueOf(i));
        }
        System.out.println(total);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        extraLongFactorials(n);
        scanner.close();
    }
}
