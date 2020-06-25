package main.java.master.clazz.faltdor.Algorithms.implementation;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BeautifulDaysAtTheMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        return (int)IntStream.rangeClosed(i, j).boxed().map(num->{
            int numReverse = Integer.valueOf(new StringBuilder().append(num).reverse().toString());
            return (num - numReverse)%k == 0;
        }).filter(result-> result.equals(true)).count();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);
        int j = Integer.parseInt(ijk[1]);
        int k = Integer.parseInt(ijk[2]);

        System.out.println(beautifulDays(i, j, k));
        scanner.close();
    }
}
