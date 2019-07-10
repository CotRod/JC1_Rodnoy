package lection02_Primitives;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first word, please");
        String word1 = sc.nextLine();

        System.out.println("Input second word, please");
        String word2 = sc.nextLine();

        if (word1.equals(word2)){
            System.out.println("Great! The words are same");
        } else if (word1.equalsIgnoreCase(word2)){
            System.out.println("OK. They are almost same");
        } else if(word1.length() == word2.length()){
            System.out.println("Well, they are at least one length");
        } else {
            System.out.println("The words are different");
        }
    }
}