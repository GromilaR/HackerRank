package Java_BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers,  and .

Constraints

 and  are non-negative integers and can have maximum  digits.

Output Format

Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.

Sample Input

1234
20
Sample Output

1254
24680

 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger num1 = new BigInteger(in.nextLine());
        BigInteger num2 = new BigInteger(in.nextLine());
        BigInteger sum = num1.add(num2);
        BigInteger multiply = num1.multiply(num2);
        System.out.println(sum.toString());
        System.out.println(multiply.toString());
    }
}
