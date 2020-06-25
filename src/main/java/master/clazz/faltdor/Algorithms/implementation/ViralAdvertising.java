package main.java.master.clazz.faltdor.Algorithms.implementation;

import java.io.IOException;
import java.util.Scanner;

public class ViralAdvertising {
    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        if(n < 0 || n > 50){
            return 0;
        }
        int amount = 2;
        int cumulative = 2;
        for (int i = 2; i <= n; i++) {
            amount = Integer.valueOf(amount*3)/2;
            cumulative = cumulative + amount;
        }
        return amount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.print(viralAdvertising(n));

        scanner.close();
    }
}
