package main.java.master.clazz.faltdor.Strings;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        System.out.println("Write the Tokens");
        s = removeNonLetters(s);
        if (s.length() == 0){
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^a-zA-Z]+");
        System.out.println(tokens.length);


        for (String token: tokens){
            System.out.println(token);
        }
    }

    private static String removeNonLetters(String str) {
        int index;
        for ( index = 0; index < str.length(); index++) {
            if (Character.isLetter(str.charAt(index))) {
                break;
            }
        }
        return str.substring(index);
    }
}
