package main.java.master.clazz.faltdor.DataStructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> list = new LinkedList<>();
        while (n-- > 0){
            list.add(scanner.nextInt());
        }
        int querySize = scanner.nextInt();

        for (int i = 0; i < querySize; i++) {
            String query = scanner.next();
            switch (query){
                case "Insert":
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    list.add(x, y);
                    break;
                case "Delete":
                    x = scanner.nextInt();
                    list.remove(x);
                    break;
            }
        }
        for (Integer num: list) {
            System.out.print(num + " ");
        }
    }
}
