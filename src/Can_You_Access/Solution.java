package Can_You_Access;


import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Inner.Private innerP= new Inner().new Private();
        String str = innerP.powerof2(num);
        System.out.println(num + " is " + str);
        System.out.println("An instance of class: " + innerP.getClass().getCanonicalName() + " has been created");
//
//
//        Method[] method = in.get;
//
//        System.out.println(method[0]);
////        System.out.println(in.getDeclaredMethods()[0].getName());
    }


    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }
}