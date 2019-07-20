package lection16_Serialization;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String path = "src" + File.separator + "lection16_Serialization" + File.separator + "Text.txt";
        String path2 = "src" + File.separator + "lection16_Serialization" + File.separator + "TextCopy.txt";

        try (FileReader fileReader = new FileReader(path);
             FileWriter fileWriter = new FileWriter(path2);
             BufferedReader br = new BufferedReader(fileReader);
             BufferedWriter bw = new BufferedWriter(fileWriter)) {
// Копирование без буфера

            long tStart = System.nanoTime();
            int c;
            while ((c=fileReader.read())!=-1) {
                fileWriter.write((char)c);
            }
            long tFinish = System.nanoTime();
            System.out.println("Time without buffer : " + (tFinish - tStart));
// Копирование с буфером
            tStart = System.nanoTime();
            String s;
            while ((s=br.readLine())!=null) {
                bw.write(s);
            }
            tFinish = System.nanoTime();
            System.out.println("Time with buffer : " + (tFinish - tStart));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

