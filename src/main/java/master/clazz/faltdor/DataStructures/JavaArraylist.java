package main.java.master.clazz.faltdor.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> lists = new ArrayList();
        for (int row = 0; row < n; row++) {
            int d = scanner.nextInt();
            List<Integer> list = new ArrayList();
            for (int col = 0; col < d; col++) {
                list.add(scanner.nextInt());
            }
            lists.add(list);
        }

        int querySize = scanner.nextInt();
        for (int i = 0; i < querySize; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            List<Integer> list = lists.get(x-1);
            if (y <= list.size()) {
                System.out.println(list.get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}
