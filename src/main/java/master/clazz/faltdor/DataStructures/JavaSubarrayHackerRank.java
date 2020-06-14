package main.java.master.clazz.faltdor.DataStructures;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.toList;

public class JavaSubarrayHackerRank {

    public static void main(String... args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int segment =  scanner.nextInt();
        int size =  scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            array.add(scanner.nextInt());
        }
        scanner.close();
        long startTime = 0;
        long duration = 0;
        NumberFormat formatter = new DecimalFormat("#0.00000");

        startTime = System.currentTimeMillis();
        System.out.println(segmentMAXCollection(segment, array));
        duration = System.currentTimeMillis();
        System.out.println("segmentMAXCollection : Execution time is " + formatter.format((duration - startTime) / 1000d) + " seconds");

        startTime = System.currentTimeMillis();
        System.out.println(segmentMAXVariable(segment, array));
        duration = System.currentTimeMillis();
        System.out.println("segmentMAXVariable : Execution time is " + formatter.format((duration - startTime) / 1000d) + " seconds");

        startTime = System.currentTimeMillis();
        System.out.println(segmentRecursive(segment, array));
        duration = System.currentTimeMillis();
        System.out.println("segmentRecursive: Execution time is " + formatter.format((duration - startTime) / 1000d) + " seconds");

    }

   /* private static int segment(int x, List<Integer> space) {
        if(x == 1){
            return space.stream().mapToInt(i->i).max().getAsInt();
        }
        List<Integer>  maximos = new ArrayList<>();
        for (int i = 0; i < space.size() ; i++) {
            Integer min = Integer.MAX_VALUE;

            for (int j = i; j < (i+x) && j < space.size(); j++) {
                Integer num = space.get(j);
                if(num < min){
                    min = num;
                }
            }
            maximos.add(min);
        }
        maximos.subList(j, (i+x))
        return Collections.max(maximos);
    }*/

    private static int segmentMAXCollection(int x, List<Integer> space) {
        if(space.size() == 1 || x == 1){
            return Collections.max(space);
        }
        List<Integer> maxSpace = new ArrayList<>();
        int length = space.size() - x;
        for (int i = 0; i <= length; i++) {
            int indexSegment = (i + x);
            List<Integer> sub = space.subList(i, indexSegment);
            Integer min = Collections.min(sub);
            maxSpace.add(min);
        }
        return Collections.max(maxSpace);
    }
  private static int segmentMAXVariable(int x, List<Integer> space) {
       if(space.size() == 1 || x == 1){
           return Collections.max(space);
       }
       Integer maxSpace = Integer.MIN_VALUE;
       int length = space.size() - x;
       for (int i = 0; i <= length; i++) {
           int indexSegment = (i + x);
           List<Integer> sub = space.subList(i, indexSegment);
           Integer min = Collections.min(sub);
           if(min > maxSpace){
               maxSpace = min;
           }
       }
       return maxSpace;
   }
   private static int segmentRecursive(int x, List<Integer> space) {
       if(space.size() == 1 || x == 1){
           return Collections.max(space);
       }
       int indexSegment = (0 + x);
       Integer maxSpace = Integer.MIN_VALUE;
       /*List<Integer> sub = space.subList(0, indexSegment);
       Integer min = Collections.min(sub);
       if(min > maxSpace){
           maxSpace = min;
       }*/
       return findSegment(0, space, x, maxSpace);
   }

    private static int findSegment(int i, List<Integer> space, int x, Integer  maxSpace) {
        if(space.size() < x + i){
            return  maxSpace;
        }

        List<Integer> sub = space.subList(i, x + i);
        Integer min = Collections.min(sub);
        if(min > maxSpace){
            maxSpace = min;
        }
        return findSegment(++i, space, x, maxSpace);
    }
}
