package main.java.master.clazz.faltdor.Algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/angry-professor/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class AngryProfessor {
    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        long totalOnTime = IntStream.of(a).boxed().filter(num -> num <= 0).count();
        return (totalOnTime >= k) ? "NO": "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }
            System.out.println(angryProfessor(k, a));
        }
        scanner.close();
    }

}