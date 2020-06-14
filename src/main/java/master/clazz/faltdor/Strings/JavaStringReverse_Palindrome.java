package main.java.master.clazz.faltdor.Strings;

import java.util.Scanner;

public class JavaStringReverse_Palindrome {

    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String reverse = new StringBuilder(word).reverse().toString();
        String result = word.equalsIgnoreCase(reverse) ? "Yes" : "No";
        System.out.println(result);
    }
}
