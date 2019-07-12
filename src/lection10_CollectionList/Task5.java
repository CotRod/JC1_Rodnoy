package lection10_CollectionList;

import lection10_CollectionList.objects.Utils;

import java.util.Set;
import java.util.TreeSet;

public class Task5 {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        Set<Integer> set2 = new TreeSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        Set<Integer> set3 = Utils.intersection(set1, set2);
        Set<Integer> set4 = Utils.toCombine(set1, set2);
    }
}
