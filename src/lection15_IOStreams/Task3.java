package lection15_IOStreams;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        String path = "src" + File.separator + "lection15_IOStreams" + File.separator + "Text.txt";
        try (FileInputStream fis = new FileInputStream(path);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            String lastWord = null;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                line = line.replaceAll("\\.,-", "");
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if(words[i].length()==0)continue;
                    if(lastWord == null){

                    }else if (lastWord.charAt(lastWord.length() - 1) == words[i].charAt(0)) {
                        System.out.print(lastWord + " " + words[i]);
                        System.out.println();
                    }
                    lastWord = words[i];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
