package main.java.master.clazz.faltdor.DataStructures;

import java.util.Scanner;

public class Java1DArrayPart2 {

    public static boolean canWin(int leap, int[] game) {
        if (game == null) {
            return false;
        }
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int index) {
        if (index >= game.length) {
            return true;
        } else if (index < 0 || game[index] == 1) {
            return false;
        }

        game[index] = 1; //evaluated
        // Recursive Cases
        return isSolvable(leap, game, index + leap)
                || isSolvable(leap, game, index + 1)
                || isSolvable(leap, game, index - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
