package Java_BitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitSize = scanner.nextInt();
        int countCase = scanner.nextInt();

        BitSet b1 = new BitSet(bitSize);
        BitSet b2 = new BitSet(bitSize);

        while (countCase-- > 0){
            String operation = scanner.next();
            int oper1 = Integer.parseInt(scanner.next());
            int oper2 = Integer.parseInt(scanner.next());

            switch (operation) {
                case "AND":
                    if (oper1 ==1) b1.and(b2); else b2.and(b1);
                    break;
                case "OR":
                    if (oper1 ==1) b1.or(b2); else b2.or(b1);
                    break;
                case "XOR":
                    if (oper1 ==1) b1.xor(b2); else b2.xor(b1);
                    break;
                case "SET":
                    if (oper1 ==1) b1.set(oper2,true); else b2.set(oper2,true);
                    break;
                case "FLIP":
                    if (oper1 ==1) b1.flip(oper2); else b2.flip(oper2);
                    break;
            }

            System.out.println(b1.cardinality()+" "+ b2.cardinality());

        }

    }
}
