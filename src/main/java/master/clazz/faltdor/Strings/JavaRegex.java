package main.java.master.clazz.faltdor.Strings;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(MyRegex.pattern));
        }
    }

    static class MyRegex{
        private static String regex = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
        public static String pattern = regex + "." +  regex + "." +  regex + "." + regex;;
    }
}
