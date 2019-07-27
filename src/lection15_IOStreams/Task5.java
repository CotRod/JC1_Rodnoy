package lection15_IOStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        String path = "src" + File.separator + "lection15_IOStreams" + File.separator + "Text5.txt";
// Создаем 20 случайных чисел больше 255 в пределах значений int
        int[] nums = new int[20];
        Random rnd = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(2147483391) + 256;
        }
// Записываем байты
        try (FileOutputStream numStreamOut = new FileOutputStream(path)) {
            for (int i : nums) {
                int fb = i >> 24;
                int sb = i >> 16;
                int tb = i >> 8;
                numStreamOut.write(fb);
                numStreamOut.write(sb);
                numStreamOut.write(tb);
                numStreamOut.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Integer> numbers = new ArrayList<>();
// Читаем байты
        try (FileInputStream numStreamIn = new FileInputStream(path)) {
            int counter = 0;
            while (numStreamIn.available() > 0) {
                int fb = numStreamIn.read() << 24;
                int sb = numStreamIn.read() << 16;
                int tb = numStreamIn.read() << 8;
                int fob = numStreamIn.read();
                int j = fb + sb + tb + fob;
                System.out.println(nums[counter++] + " -> " + j);
                numbers.add(j);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        double avg = numbers.stream()
                .peek(element -> System.out.print(element+" "))
                .mapToLong(Integer::longValue)
                .average().orElse(0);
        System.out.println();
        System.out.println(avg);
    }
}
