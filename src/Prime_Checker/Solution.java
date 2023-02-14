package Prime_Checker;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        int n1 = Integer.parseInt(br.nextLine());
        int n2 = Integer.parseInt(br.nextLine());
        int n3 = Integer.parseInt(br.nextLine());
        int n4 = Integer.parseInt(br.nextLine());
        int n5 = Integer.parseInt(br.nextLine());

        Prime prime = new Prime();
        prime.check(n1);
        prime.check(n1, n2);
        prime.check(n1, n2, n3);
        prime.check(n1, n2, n3, n4, n5);
    }
}

class Prime {

    void check(int... number) {
        String str = "";
        for (int i : number) {
            if (primeChecker(i)) str = str + i + " ";
        }
        System.out.println(str);
    }

    boolean primeChecker(int number) {
        if ((number == 1) || number < 0) return false;
        for (int i = 2; i < number; i++) if (number % i == 0) return false;
        return true;
    }
}