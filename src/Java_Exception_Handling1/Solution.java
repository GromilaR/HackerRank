package Java_Exception_Handling1;

import java.util.Scanner;

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
               if (my_calculator.power(n, p)!=-1) {System.out.println(my_calculator.power(n, p));}
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyCalculator {
    long power(int x1,int x2){
       if (x1<0 || x2<0) {
            System.out.println("java.lang.Exception: n or p should not be negative.");
            return -1;}
        if (x1==0 || x2==0) {
            System.out.println("java.lang.Exception: n and p should not be zero.");
            return -1;
        }

        return (long) Math.pow(x1,x2);
    }
}
