package main.java.master.clazz.faltdor.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BigInteger bigInteger = scanner.nextBigInteger();
        System.out.println(bigInteger.isProbablePrime(10) ? "prime" : "not prime");
        scanner.close();
    }
}
