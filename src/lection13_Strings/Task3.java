package lection13_Strings;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string");
        String str = sc.nextLine();
        System.out.println("Input word");
        String word = sc.nextLine();
        sc.close();


        if(isChecking(str, word)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }

    private static boolean isChecking(String s, String w) {
        s=s.toLowerCase();
        w=w.toLowerCase();
        return s.startsWith(w) && s.endsWith(w);
    }
}
