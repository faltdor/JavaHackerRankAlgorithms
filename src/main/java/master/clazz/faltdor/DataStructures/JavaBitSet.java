package main.java.master.clazz.faltdor.DataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);

        while (m-- >0){
            String operation = scanner.next();
            int leftOperand = scanner.nextInt();
            int rightOperand = scanner.nextInt();
            switch (operation){
                case "AND":
                    if (leftOperand == 1){
                         bitSet1.and(bitSet2);
                        break;
                    }
                    bitSet2.and(bitSet1);
                    break;
                case "OR":
                    if (leftOperand == 1){
                        bitSet1.or(bitSet2);
                        break;
                    }
                    bitSet2.or(bitSet1);
                    break;
                case "XOR":
                    if (leftOperand == 1){
                        bitSet1.xor(bitSet2);
                        break;
                    }
                    bitSet2.xor(bitSet1);
                    break;
                case "FLIP":
                    if (leftOperand == 1){
                        bitSet1.flip(rightOperand);
                        break;
                    }
                    bitSet2.flip(rightOperand);
                    break;
                case "SET":
                    if (leftOperand == 1){
                        bitSet1.set(rightOperand);
                        break;
                    }
                    bitSet2.set(rightOperand);
                    break;
                default:
                    break;
            }
            System.out.println(new StringBuilder().append(bitSet1.cardinality()).append(" ").append(bitSet2.cardinality()));
        }
    }
}
