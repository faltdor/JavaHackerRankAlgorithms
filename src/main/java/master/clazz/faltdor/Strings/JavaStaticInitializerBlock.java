package main.java.master.clazz.faltdor.Strings;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    private static int B;
    private static int H;
    private static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);

        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();

        if (B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args){
        int i = 3;

        String s = String.valueOf(i);

        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
