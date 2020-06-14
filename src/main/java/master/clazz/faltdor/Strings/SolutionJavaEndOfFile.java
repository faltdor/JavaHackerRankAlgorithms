package main.java.master.clazz.faltdor.Strings;

import java.util.Scanner;

public class SolutionJavaEndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = 1;
        while (scanner.hasNext()){
            System.out.println(line + " " + scanner.nextLine());
            line ++;
        }
        scanner.close();
    }
}
