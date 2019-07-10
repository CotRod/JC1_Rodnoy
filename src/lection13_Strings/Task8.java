package lection13_Strings;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your string");
        String str = sc.nextLine();
        sc.close();
        System.out.println(str);
        str=str.toLowerCase().replace(" ", "");
        String strRev= new StringBuilder(str).reverse().toString();
        if(strRev.equals(str)){
            System.out.println("It's a palindrome");
        }else{
            System.out.println("It's not palindrome");
        }
    }
}
