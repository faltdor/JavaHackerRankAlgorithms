package main.java.master.clazz.faltdor.DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> contacts =  new HashMap<>();
        for(int i=0;i<n;i++){
            String name = in.nextLine();
            int phone = in.nextInt();
            contacts.put(name, phone);
            in.nextLine();
        }

        while(in.hasNext()){
            String s = in.nextLine();
            if (contacts.containsKey(s)){
                System.out.println(new StringBuilder().append(s).append("=").append(contacts.get(s)));
            }else {
                System.out.println("Not found");
            }
        }
    }
}
