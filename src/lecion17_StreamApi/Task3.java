package lecion17_StreamApi;

import lecion17_StreamApi.interfaces.FinderKV;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> test = new HashMap<>();
        test.put("one", 1);
        test.put("two", 2);
        test.put("three", 3);
        test.put("twenty one", 21);
        test.put("fourteen", 14);

        FinderKV finKV = (map) -> {
            int sum = 0;
            Set<String> keys = new HashSet<>(map.keySet());
            for (String s : keys) {
                if (s.length() < 7) {
                    sum += map.get(s);
                }
            }
            return sum;
        };

        System.out.println(finKV.sumVal(test));
    }
}
