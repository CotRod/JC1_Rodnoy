package lection13_Strings;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Input text:");
        String str = sc.nextLine();
        sc.close();
        str = str.trim();
        if(str.length()!=0){
            count++;
        }else {
            System.out.println("There are no words");
        }
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==' '){
                if(str.charAt((i+1))!=' '){
                    count++;
                }
            }
        }
        System.out.println("There are "+count+" words");
    }
}
