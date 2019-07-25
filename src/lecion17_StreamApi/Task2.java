package lecion17_StreamApi;


import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Дан список целых чисел");
        stringList.add("Дан список строк");
        stringList.add("Дан список целых чисел");
        stringList.add("Дан список целых чиесл");
        stringList.add("Найти уникальные");
        stringList.add("Не < 8");

        long count = stringList.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .peek(System.out::println)
                .count();

        System.out.print("Amount of unique strings is " + count);
    }
}
