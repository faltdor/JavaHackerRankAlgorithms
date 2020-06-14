package main.java.master.clazz.faltdor.Algorithms;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        int length =  a.length;
        int [] reverseArray = new int[length];
        int index=0;
        for (int i = length -1 ; i >= 0; i--) {
            reverseArray[index++] = a[i];
        }
        a = reverseArray;
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.printf("%2s", a[i]);
        }
    }
}
