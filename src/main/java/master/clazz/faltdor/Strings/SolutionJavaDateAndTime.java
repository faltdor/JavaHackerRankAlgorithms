package main.java.master.clazz.faltdor.Strings;

import java.io.IOException;
import java.time.LocalDate;

public class SolutionJavaDateAndTime {


    public static void main(String[] args) throws IOException {
        String res = Result.findDay(8, 5, 2015);
        System.out.println(res);
    }
}

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year,month,day).getDayOfWeek().name();
    }

}