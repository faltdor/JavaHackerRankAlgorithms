package main.java.master.clazz.faltdor.DataStructures;

import java.util.Scanner;

public class JavaSubarray {

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        int size =  scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size ; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(totalSubArraysNegativeValues(array));
    }

    private static int totalSubArraysNegativeValues(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length ; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    total++;
                }
            }
        }
        return total;
    }
}
