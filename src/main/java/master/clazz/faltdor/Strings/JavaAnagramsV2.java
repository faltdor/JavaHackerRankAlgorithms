package main.java.master.clazz.faltdor.Strings;

import java.util.*;

public class JavaAnagramsV2 {

    static boolean isAnagram(String a, String b) {
        char[] word1 = a.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        char[] word2 = b.toLowerCase().replaceAll("[\\s]", "").toCharArray();
        java.util.Arrays.sort(word1);
        java.util.Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

    public static void main(String[] args) {

       /* Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );*/


        List<Integer> values
                = Arrays.asList(212, 324,
                435, 566,
                133, 100,
                121);

        // reverseOrder is a static method

        //values.sort(Comparator.comparing());

        // print sorted number based on natural order
        System.out.println(values);
    }
}
