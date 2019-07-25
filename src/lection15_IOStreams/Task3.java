package lection15_IOStreams;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String path = "src" + File.separator + "lection15_IOStreams" + File.separator + "Text.txt";
        Pattern p = Pattern.compile("\\b\\w*(\\w)\\b\\s?\\n?\\b\\1\\w*\\b");
        try (FileInputStream fis = new FileInputStream(path);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            String text;
            StringBuilder buffer = new StringBuilder();
            while ((text = br.readLine()) != null) {
                buffer.append(text).append(" ");
            }
            text = buffer.toString();
            Matcher matcher = p.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}