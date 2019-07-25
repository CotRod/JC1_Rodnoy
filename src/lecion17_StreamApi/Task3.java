package lecion17_StreamApi;


import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> test = new HashMap<>();
        test.put("one", 1);
        test.put("two", 2);
        test.put("three", 3);
        test.put("twenty one", 21);
        test.put("fourteen", 14);

        System.out.println(test.entrySet().stream()
                .filter(element -> element.getKey().length() < 7)
                .map(Map.Entry::getValue)
                .reduce(Integer::sum)
                .get());
    }
}
