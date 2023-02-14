package Java_Singleton_Pattern;

import java.util.Scanner;

class Singleton{
    public static String str="";
    private static Singleton instance;
    private Singleton (){
        System.out.printf("Hello I am a singleton! Let me say %s to you", str);
    }
    public static Singleton getSingleInstance(){
        if (instance == null) { instance=new Singleton();}
        return instance;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Singleton.str = scanner.nextLine();
        Singleton s1 = Singleton.getSingleInstance();

    }
}
