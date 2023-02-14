package Java_Exception_Handling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int rez=x/y;
            System.out.println(rez);
        } catch (Exception e){
            if (e instanceof InputMismatchException){
                System.out.println("java.util.InputMismatchException");}
                else    System.out.println(e);
        }
    }
}
