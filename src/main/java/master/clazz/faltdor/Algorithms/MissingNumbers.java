package main.java.master.clazz.faltdor.Algorithms;

import java.security.KeyPair;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {

    static int[] missingNumbers(int[] arr, int[] brr) {
        Map<Integer, Integer> completeArray = IntStream.of(brr).boxed().collect(Collectors.groupingBy(v -> v,
                Collectors.reducing(0, e -> e, Integer::sum)));

        for (int i = 0; i < arr.length; i++) {
            completeArray.merge(arr[i], 1, Integer::sum);
        }
        return completeArray.entrySet().stream().filter(num-> (!(num.getValue()%2 == 0) && num.getValue() > 1))
                .mapToInt(num-> num.getValue())
                .toArray();

        //return IntStream.of(brr).filter(num -> !missingSet.contains(num)).toArray();

    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%2%S", result[i]);
        }

        scanner.close();
    }

}
