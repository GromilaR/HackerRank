package Java_Varargs_Simple_Addition;


import java.util.*;


class Add {
    void add(int... data) {
        int sum = 0;String result="";
        for (int intNum : data) { sum += intNum;result=result+intNum+"+";}
        result=result.substring(0,result.length()-1)+"="+sum;
            System.out.println(result);

    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner br = new Scanner(System.in);
        int n1 = Integer.parseInt(br.nextLine());
        int n2 = Integer.parseInt(br.nextLine());
        int n3 = Integer.parseInt(br.nextLine());
        int n4 = Integer.parseInt(br.nextLine());
        int n5 = Integer.parseInt(br.nextLine());
        int n6 = Integer.parseInt(br.nextLine());
        Add ob = new Add();
        ob.add(n1, n2);
        ob.add(n1, n2, n3);
        ob.add(n1, n2, n3, n4, n5);
        ob.add(n1, n2, n3, n4, n5, n6);
    }
}