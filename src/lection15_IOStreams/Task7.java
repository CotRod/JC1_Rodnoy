package lection15_IOStreams;

import java.io.*;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String path = "src" + File.separator + "lection15_IOStreams" + File.separator + "Task1.java";
        String path2 = "src" + File.separator + "lection15_IOStreams" + File.separator + "1ksaT.txt";
        try (FileReader fr = new FileReader(path); Scanner sc = new Scanner(fr); FileWriter fw = new FileWriter(path2)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                char[] chars = line.toCharArray();
                for (int i = chars.length - 1; i >= 0; i--) {
                    fw.write(chars[i]);
                }
                fw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
