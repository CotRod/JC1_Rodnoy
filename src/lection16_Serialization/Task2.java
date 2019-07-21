package lection16_Serialization;

import lection16_Serialization.objects.Computer;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        Computer myComp = new Computer("Rodnoy", 4, 64);
        String path = "src" + File.separator + "lection16_Serialization" + File.separator + "Serialize.txt";
        Computer MyCompSerial = null;
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream objOut = new ObjectOutputStream(fos)) {
            objOut.writeObject(myComp);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream objIn = new ObjectInputStream(fis)) {
            MyCompSerial = (Computer) objIn.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After serialize:");
        System.out.println(myComp);
        System.out.println("Before:");
        System.out.println(MyCompSerial);
    }
}
