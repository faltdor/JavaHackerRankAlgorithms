package main.java.master.clazz.faltdor.DataStructures;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class JavaStack {

    static HashMap<Character, Character> map = new HashMap();
    static {
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
    }
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(isBalanced(input, map) ? "true" : "false" );
        }
        scanner.close();
    }
    private static boolean isBalanced(String input, HashMap<Character, Character> map) {
        if ((input.length() % 2) != 0) {
            return false; // odd length Strings are not balanced
        }
        ArrayDeque<Character> deque = new ArrayDeque(); // use deque as a stack
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }
}
