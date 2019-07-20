package lection15_IOStreams;

import java.io.File;
import java.io.FileNotFoundException;

public class Task6 {
    public static void main(String[] args) {
        String path = "src";
        File file = new File(path);
        showList(file);
    }

    private static void showList(File file) {
        if (file.isDirectory()) {
            System.out.println(file.getName() + " is a Folder, that contains :");
            for (File f : file.listFiles()) {
                System.out.print("\t");
                showList(f);
            }
        } else if (file.isFile()) {
            System.out.println("\t" + file.getName() + " is a File.");
        }
    }
}
