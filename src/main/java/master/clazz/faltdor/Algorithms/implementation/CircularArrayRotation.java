package main.java.master.clazz.faltdor.Algorithms.implementation;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation/problem?h_r=next-challenge&h_v=zen
 */
public class CircularArrayRotation {
    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.rotate(list, k);

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length ; i++) {
            result[i] = list.get(queries[i]);
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nkq = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nkq[0]);
        int k = Integer.parseInt(nkq[1]);
        int q = Integer.parseInt(nkq[2]);
        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }
        Interface2.print();
        int[] result = circularArrayRotation(a, k, queries);
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
}
interface Interface2 {
    static void print() {
        System.out.print("World!");
    }
}

