package main.java.master.clazz.faltdor.Algorithms.warmup;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlusMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        Map<Integer, Integer> cases = new HashMap<>();
        cases.put(1,0);
        cases.put(-1,0);
        cases.put(0,0);
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i]< 0) {
                cases.merge(-1, 1, Integer::sum);
            }else if(arr[i]==0) {
                cases.merge(0, 1, Integer::sum);
            }else {
                cases.merge(1, 1, Integer::sum);
            }
        }

        BigDecimal totalNegative = new BigDecimal((double)cases.get(-1)/length).setScale(6, RoundingMode.CEILING);
        BigDecimal totalZero = new BigDecimal((double)cases.get(0)/length).setScale(6, RoundingMode.CEILING);
        BigDecimal totalPositive = new BigDecimal((double)cases.get(1)/length).setScale(6, RoundingMode.CEILING);

        System.out.printf("%.6f \n", totalPositive);
        System.out.printf("%.6f \n", totalNegative);
        System.out.printf("%.6f", totalZero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        plusMinus(arr);
        scanner.close();
    }
}
