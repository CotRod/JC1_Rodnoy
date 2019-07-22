package lection14_Regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String s = "0x4C5 fijnvonvs 0Xy0x7fff ijgrojgro0xbC735";
        Pattern pattern = Pattern.compile("0x[0-9a-f]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group().toUpperCase());
        }
    }
}
