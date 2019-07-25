package lection15_IOStreams;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String path = "src" + File.separator + "lection15_IOStreams" + File.separator + "Text.txt";
        try (FileInputStream fis = new FileInputStream(path);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            Pattern p = Pattern.compile("(\\b[aouie].*?\\b)",Pattern.CASE_INSENSITIVE);
            while ((line = br.readLine()) != null) {
                Matcher m = p.matcher(line);
                while (m.find()){
                    System.out.print(m.group()+" ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
