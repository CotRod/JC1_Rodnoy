package lection13_Strings;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input text");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Quantity of '!' and '.' and ',' is "+ isCounting(str));

    }
    private static int isCounting(String str){
        int count = 0;
        for(int i = 0; i<str.length();i++){
            if (str.charAt(i)==',' || str.charAt(i)=='!' || str.charAt(i)=='.' ){
                count++;
            }
        }
        return count;
    }
}
