package lection14_Regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        String p = "^(((1\\d\\d)|(2[0-4]\\d)|(25[0-5])|([1-9]\\d)|(\\d))\\.){3}((1\\d\\d)|(2[0-4]\\d)|(25[0-5])|([1-9]\\d)|(\\d))$";
        boolean valid;
        do {
            System.out.println("Input IPv4: ");
            s = sc.nextLine();
            Pattern pattern = Pattern.compile(p);
            Matcher matcher = pattern.matcher(s);
            valid = matcher.matches();
        } while (!valid);
        System.out.println("Good job, man!");
        sc.close();
    }
}
