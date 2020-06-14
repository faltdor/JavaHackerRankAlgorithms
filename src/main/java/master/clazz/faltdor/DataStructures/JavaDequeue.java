package main.java.master.clazz.faltdor.DataStructures;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int max = 0;

        Map<Integer, Integer> map = new HashMap();
        ArrayDeque<Integer> deque = new ArrayDeque();
        for (int i = 0; i < n; i++) {
            if (i >= m) {
                int old = deque.removeFirst();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.merge(old, -1, Integer::sum);
                }
            }

            int num = scanner.nextInt();
            deque.addLast(num);
            map.merge(num, 1, Integer::sum);
            max = Math.max(max, map.size());

            if (max == m) {
                break;
            }
        }
        scanner.close();
        System.out.println(max);
    }
}
