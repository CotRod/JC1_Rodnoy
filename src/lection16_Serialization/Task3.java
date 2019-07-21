package lection16_Serialization;

import lection16_Serialization.objects.Notebook;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        Notebook myNotebook = new Notebook("Rodnoy", 4,64,"Logitech Wireless Touchpad",2,13);
        String path = "src" + File.separator + "lection16_Serialization" + File.separator + "NoteSer.txt";
        Notebook myNoteSer= null;
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream objOut = new ObjectOutputStream(fos)){
            objOut.writeObject(myNotebook);
        }catch (IOException e){
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(path);
                ObjectInputStream objIn = new ObjectInputStream(fis)){
            myNoteSer = (Notebook)objIn.readObject();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(myNotebook);
        System.out.println();
        System.out.println(myNoteSer);

    }
}
