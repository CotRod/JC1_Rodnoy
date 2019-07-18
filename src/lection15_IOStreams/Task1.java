package lection15_IOStreams;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String path = "src"+ File.separator + "lection15_IOStreams"+ File.separator + "Text.txt";
        try(FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr)){

            String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
