package lection14_Regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String s = "My tel. num +375291234567, and my dog's tel. num. +375449876543";
        System.out.println(s);
        Pattern pattern = Pattern.compile("\\+375(29|44|33|17)(\\d{3})(\\d{2})(\\d{2})");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String num1 = s.substring(matcher.start(), matcher.end());
            String num2 = "+375(" + matcher.group(1) + ")" + matcher.group(2) + "-" + matcher.group(3) + "-" + matcher.group(4);
            s = s.replace(num1, num2);
            matcher.reset(s);
        }
        System.out.println(s);
    }
}
