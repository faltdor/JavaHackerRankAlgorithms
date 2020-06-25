package main.java.master.clazz.faltdor.Algorithms.implementation;

import java.io.IOException;
import java.util.Scanner;

public class SaveThePrisoner {
    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int numberOfPrisoners , int numberOfsweets , int chairToBegin) {
        return ((numberOfsweets+chairToBegin-2)%numberOfPrisoners)+1;
        /*Not Optimus
        while (numberOfsweets>0){
            numberOfsweets--;
            ++chairToBegin;
            if(chairToBegin>numberOfPrisoners && numberOfsweets>0){
                chairToBegin = 1;
            }
        }
        return chairToBegin-1;*/
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nms = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nms[0]);
            int m = Integer.parseInt(nms[1]);
            int s = Integer.parseInt(nms[2]);
            System.out.println(saveThePrisoner(n, m, s));
        }
        scanner.close();
    }
}
