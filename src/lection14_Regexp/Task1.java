package lection14_Regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        boolean flag;
        do {
            System.out.print("Input email:");
            s = sc.nextLine();
            Pattern p = Pattern.compile("[a-z]\\w*@\\w*\\.(org|com)", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(s);
            if (!(flag = m.matches())) {
                System.out.println("Incorrect email. Try again");
            } else {
                System.out.println("Ok, we will be sending a spam to you :)");
            }
        } while (!flag);
        sc.close();
    }
}
