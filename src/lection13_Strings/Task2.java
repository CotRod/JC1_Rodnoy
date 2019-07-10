package lection13_Strings;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("There is a place for your sad string");
        String str = sc.nextLine();
        sc.close();
        System.out.println(str);
        str=str.replace(":(",":)");
        System.out.println(str);
    }
}
