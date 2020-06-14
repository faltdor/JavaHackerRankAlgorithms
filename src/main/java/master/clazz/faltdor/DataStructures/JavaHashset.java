package main.java.master.clazz.faltdor.DataStructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<String> set = new HashSet(t);
        for (int i = 0; i < t; i++) {
            set.add(new StringBuilder().append(pair_left[i]).append(" ").append(pair_right[i]).toString());
            System.out.println(set.size());
        }
    }
}
