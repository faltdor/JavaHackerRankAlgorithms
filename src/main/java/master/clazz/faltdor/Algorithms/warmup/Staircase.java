package main.java.master.clazz.faltdor.Algorithms.warmup;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Staircase {
    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 1; i <= n ; i++) {
            String pattern = "%" + (n) + "s" + "%n";
            String symbol = IntStream.range(0, i).mapToObj(index -> "#").collect(Collectors.joining(""));
            System.out.printf(pattern, symbol);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        staircase(n);
        scanner.close();
    }
}
