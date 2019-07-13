package lection10_CollectionList.objects;

import java.util.Set;
import java.lang.Integer;
import java.util.TreeSet;

public class Utils {
    public static Set intersection(Set<Integer> first, Set<Integer> second) {

        Set<Integer> newSet = new TreeSet(first);
        newSet.retainAll(second);
        System.out.println(newSet);
        return newSet;
    }

    public static Set toCombine(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new TreeSet(first);
        newSet.addAll(second);
        System.out.println(newSet);
        return newSet;
    }
}
