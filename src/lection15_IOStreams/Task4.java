package lection15_IOStreams;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        String path = "src" + File.separator + "lection15_IOStreams" + File.separator + "Text2.txt";
        try (FileInputStream fis = new FileInputStream(path);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                line = line.replaceAll("[^\\d]", " ");
                line = line.replaceAll("[\\s]{2,}", " ");
                line = line.trim();
                String [] words = line.split(" ");
                LinkedList<Integer> numbers = new LinkedList<>();
                for(String s:words){
                        numbers.add(Integer.parseInt(s));
                }
                Collections.sort(numbers);
                System.out.println(numbers.getLast());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
