package lecion17_StreamApi;

import lecion17_StreamApi.interfaces.StringFinder;

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

        StringFinder strFin = (list) -> {
            Set <String> stringSet = new HashSet();
            for (String s : list) {
                if (s.length() > 8) {
                    stringSet.add(s);
                }
            }
            System.out.println(stringSet);
            return stringSet.size();
        };

        System.out.println("Amount of unique strings is " + strFin.countUnique(stringList));
    }
}
