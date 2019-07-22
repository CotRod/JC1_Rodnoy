package lection15_IOStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String path = "src";
        File file = new File(path);
        showList(file);
    }

    private static void showList(File file) {
        Pattern pattern = Pattern.compile("\\\\");
        Matcher matcher = pattern.matcher(file.getPath());
        while (matcher.find()){
            System.out.print("|\t");
        }

        if (file.isDirectory()) {
            System.out.println(file.getName() + " is a Folder, that contains :");
            for (File f : file.listFiles()) {
                showList(f);
            }
        } else if (file.isFile()) {
            System.out.println(file.getName() + " is a File.");
        }
    }
}
