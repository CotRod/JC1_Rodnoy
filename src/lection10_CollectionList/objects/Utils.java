package lection10_CollectionList.objects;

import java.util.Iterator;
import java.util.Set;
import java.lang.Integer;
import java.util.TreeSet;

public class Utils {
    public static Set intersection(Set<Integer> first, Set<Integer> second) {
        Iterator<Integer> iter = second.iterator();
        Set<Integer> newSet = new TreeSet();
        while (iter.hasNext()) {
            int i = iter.next();
            if (first.contains(i)) {
                newSet.add(i);
            }
        }
        System.out.println(newSet);
        return newSet;
    }

    public static Set toCombine(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new TreeSet<>();
        newSet.addAll(first);
        newSet.addAll(second);
        System.out.println(newSet);
        return newSet;
    }
}
