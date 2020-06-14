package main.java.master.clazz.faltdor.DataStructures;

import java.util.Scanner;

public class Java2DArray {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(findMaxHour(arr));
        scanner.close();
    }

    public static int findMaxHour(int [][] arr) {
        int maxHour = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sum = sum(arr, row, col);
                maxHour = Math.max(maxHour, sum);
            }
        }
        return maxHour;
    }

    private static int sum(int [][] arr, int row, int column) {
        int sum = arr[row+0][column+0] + arr[row+0][column+1] + arr[row+0][column+2]
                + arr[row+1][column+1] +
                arr[row+2][column+0] + arr[row+2][column+1] + arr[row+2][column+2];
        return sum;
    }
}
