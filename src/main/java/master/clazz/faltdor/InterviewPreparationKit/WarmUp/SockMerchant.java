package main.java.master.clazz.faltdor.InterviewPreparationKit.WarmUp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        //Arrays.sort(ar);
        Map<Integer, Integer> socks =  new HashMap<>();
        for (int color: ar) {
            if(!socks.containsKey(color)){
                socks.put(color, 1);
                continue;
            }
           int total = socks.get(color);
           socks.put(color, total+1);
           //socks.merge(color, 1, Integer::sum);
        }
        int sumTotalPairs = 0;
        for (Map.Entry<Integer, Integer> sock: socks.entrySet()) {
           int pairs = (int)(sock.getValue()/2);
           sumTotalPairs+= pairs;
        }
        return  sumTotalPairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
