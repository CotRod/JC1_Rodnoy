package lection15_IOStreams;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        String path = "src" + File.separator + "lection15_IOStreams" + File.separator + "Text.txt";
        try (FileInputStream fis = new FileInputStream(path);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                line = line.replaceAll("\\.", "");
                String[] words = line.split(" ");
                for (String w : words) {
                    if (w.startsWith("a") || w.startsWith("o") || w.startsWith("u") || w.startsWith("i") || w.startsWith("e")) {
                        System.out.print(w + " ");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
